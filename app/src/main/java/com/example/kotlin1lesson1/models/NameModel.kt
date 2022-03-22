package com.example.kotlin1lesson1.models

import java.io.Serializable

data class NameModel(
    val title: String,
    val description: String,
    val image: Int
) : Serializable