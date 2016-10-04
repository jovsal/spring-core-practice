import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public MovieRepository movieRepository()
    {
        return new MovieRepository();
    }

    @Bean
    public MovieService movieService(){
        return new MovieService();
    }

}
