package com.microservicestutorial.movieratingservice.controllers;

import com.microservicestutorial.movieratingservice.resources.RatingResource;
import com.microservicestutorial.movieratingservice.resources.UserRatingsResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/movie-rating")
public class MovieRatingController {

    @GetMapping("/{id}")
    public RatingResource getRatingForMovie(@PathVariable(value="id") int id) {
        return new RatingResource(id, 1);
    }

    // Prefer return an Object io a List because an Object properties can be omitted by the consumer
    // but if you make a List and in the future you want to add a parameter, you have to modify the return
    // type from a List to an Object and the consumer has to change also its code, so better to directly make an object
    @GetMapping("/user/{userId}")
    public UserRatingsResource getRatingsForUserId(@PathVariable(value="userId") int userId) {
        return new UserRatingsResource(userId, Arrays.asList(
                new RatingResource(0, 4),
                new RatingResource(1, 3),
                new RatingResource(2, 5)
        ));
    }
}
