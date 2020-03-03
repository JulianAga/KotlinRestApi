package com.kotlinApp.demo.repositories

import com.kotlinApp.demo.models.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : JpaRepository<Movie,Int>