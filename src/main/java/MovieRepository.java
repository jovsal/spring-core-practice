import org.omg.CORBA.Environment;
import org.omg.CORBA.portable.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

@Component
public class MovieRepository {

//    @Value("${fileLocation}")
//    private String filePath;

    public void read(){
        System.out.println("read movie");
    }

    public void write(){
        System.out.println("write movie");
    }

    public List<String> readAll() throws IOException {

        List<String> stringList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\gitProjects\\spring-core-practice\\src\\main\\resources\\movies.txt"));
        String inValue;

        while( (inValue = bufferedReader.readLine()) !=null ){
            stringList.add(inValue);
        }

        return stringList;
    }

    public void insert(Movie m) throws IOException {
        File file = new File("C:\\gitProjects\\spring-core-practice\\src\\main\\resources\\movies.txt");
        String line = m.getName()+ "," +m.getYearReleased();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
        out.println(line);
        out.close();

    }



}
