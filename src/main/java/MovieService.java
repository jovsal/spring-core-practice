import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    public MovieRepository movieRepository;

    public void readMovie(){
        movieRepository.read();
    }
    public void writeMovie(){
        movieRepository.write();
    }

    public List<Movie> getAllMovies() throws IOException {
        List<Movie> movies = new ArrayList<Movie>();
        List<String> moviesRaw =  movieRepository.readAll();
        for (String s: moviesRaw ) {
            String movieName = s.split(",")[0];
            String movieYear = s.split(",")[1];
            Movie movie = new Movie(movieName, Integer.valueOf(movieYear));
            movies.add(movie);
        }
        return movies;
    }

    public void insertMovie(Movie m) throws IOException {
        movieRepository.insert(m);
    }


    public void printAllMovies() throws IOException {
        List<Movie> movies = getAllMovies();
        for (Movie m: movies ) {
            System.out.println(m);
        }
    }
}
