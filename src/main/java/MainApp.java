import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);

        MovieService movieService = (MovieService) ctx.getBean("movieService");

        System.out.println("Insert the number of the option and hit enter to use it. \nOptions:");
        System.out.println("1.Read All Movies");
        System.out.println("2.Insert new movie");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        int option = scanner.nextInt();
        if(option == 1){
            movieService.printAllMovies();
        }
        else if(option == 2)
        {
            Movie m = new Movie("nameNewMovie", 2016 );

            System.out.println("Insert the movie name:");
            String name = scanner.next();
            m.setName(name.trim());

            System.out.println("Insert the movie released year:");
            int year = scanner.nextInt();
            m.setYearReleased(year);

            movieService.insertMovie(m);
            System.out.println("The movie is inserted.");
        }

    }

}
