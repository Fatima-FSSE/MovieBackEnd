package dev.fatimafse.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //notation for database to connect the document name "movies"
@Data // notation from lombok which will take care of getter and setter of all the objects.
@AllArgsConstructor // notation for all argument constructor by lombok
@NoArgsConstructor // notation for no argument constructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference  //Manual reference relationship
    private List<Review> reviewIds;
}
