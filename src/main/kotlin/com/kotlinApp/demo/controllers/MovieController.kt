package com.kotlinApp.demo.controllers

import com.kotlinApp.demo.models.Movie
import com.kotlinApp.demo.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movie")
class MovieController {

    @Autowired
    lateinit var movieRepository: MovieRepository;

    @PostMapping
    fun insert(@RequestBody movie: Movie) {
        movieRepository.save(movie);
    }

    @GetMapping
    fun findAll(): List<Movie> {
        return movieRepository.findAll();
    }

}