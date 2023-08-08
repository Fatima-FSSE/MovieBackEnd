package dev.fatimafse.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService { //Service Class

    @Autowired // let the framework know to initialize the object
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){ //Database access Methods
        return movieRepository.findAll(); // will return all the documents from the Movie collection
    }

    public Optional<Movie> getSingleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
