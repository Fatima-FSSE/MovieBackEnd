package dev.fatimafse.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { // need to define in MongoRepository which kind of Data and id will be used.
    Optional<Movie> findMovieByImdbId(String imdbId); //Spring framework will find the element with name of imdbId within the document and return the value with the matching String

}
