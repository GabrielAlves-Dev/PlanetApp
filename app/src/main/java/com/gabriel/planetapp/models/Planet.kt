package com.gabriel.planetapp.models

import com.gabriel.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val planetList = listOf(
    Planet(
        id = 1,
        name = "Terra",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "149.6 milhões de km",
        diameter = "12,742 km",
        characteristics = "Suporta vida, possui água e atmosfera.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 2,
        name = "Marte",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "227.9 milhões de km",
        diameter = "6,779 km",
        characteristics = "Conhecido como o planeta vermelho, possui óxido de ferro na superfície.",
        imageRes = R.drawable.ic_launcher_background
    )
)