package io.javabrain.movieratingservice.resources;

import io.javabrain.movieratingservice.models.Rating;
import io.javabrain.movieratingservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movie/rating")
public class MovieRating {

    @RequestMapping(path = "/{movieId}")
    public UserRatings getRating(@PathVariable("movieId") String movieId){
        List<Rating> ratings = Arrays.asList(
                new Rating("123",4),
                new Rating("321",3),
                new Rating("200",4)
        );

        UserRatings userRatings = new UserRatings();
        userRatings.setUserRating(ratings);
        return userRatings;


    }
}
