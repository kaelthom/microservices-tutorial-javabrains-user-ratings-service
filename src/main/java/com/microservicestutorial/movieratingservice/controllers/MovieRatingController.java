package com.microservicestutorial.movieratingservice.controllers;

import com.microservicestutorial.movieratingservice.resources.RatingResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-rating")
public class MovieRatingController {

    @GetMapping("/{id}")
    public RatingResource getRatingForMovie(@PathVariable(value="id") int id) {
        return new RatingResource(id, 1);
    }
}
