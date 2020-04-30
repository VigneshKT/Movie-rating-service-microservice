package io.javabrain.movieratingservice.models;

import java.util.List;

public class UserRatings {
    List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
