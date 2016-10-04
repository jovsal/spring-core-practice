import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;

@Component
public class MovieRepository {

//    @Value("${fileLocation}")
//    private String filePath;

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
