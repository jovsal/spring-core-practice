import org.omg.CORBA.portable.InputStream;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Component
public class MovieRepository {

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
//        BufferedWriter bufferedWriter = new BufferedWriter(
//                new FileWriter(file.getAbsoluteFile()));
//        System.out.println(line);
//        bufferedWriter.write(line);
//        bufferedWriter.close();
        File file = new File("C:\\gitProjects\\spring-core-practice\\src\\main\\resources\\movies.txt");
        String line = m.getName()+ "," +m.getYearReleased();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
        out.println(line);
        out.close();

    }



}
