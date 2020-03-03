package com.kotlinApp.demo.models

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "movies")
data class Movie(@Id
                 @GeneratedValue(strategy = GenerationType.IDENTITY)
                 val id: Int? = null ,var name: String? = "", var duration: String? = "", var description: String? = "") : Serializable