package com.kotlinApp.demo.services

import com.kotlinApp.demo.models.Movie
import com.kotlinApp.demo.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired

@Autowired
var movieRepository:  MovieRepository = TODO();

fun findAll() : List<Movie>
{
    return movieRepository.findAll();
}

fun insert(movie : Movie)
{
    movieRepository.save(movie);
}

