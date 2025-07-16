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
    val isFavorite: Boolean = false
)

val planetList = listOf(
    Planet(
        id = 1,
        name = "Mercúrio",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "57,9 milhões de km",
        diameter = "4.879 km",
        characteristics = "O menor planeta do sistema solar e o mais próximo do Sol. Não possui atmosfera significativa, o que causa temperaturas extremas.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 2,
        name = "Vênus",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "108,2 milhões de km",
        diameter = "12.104 km",
        characteristics = "Conhecido como o 'planeta irmão' da Terra por seu tamanho similar. Possui uma atmosfera densa de dióxido de carbono, tornando-o o planeta mais quente.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 3,
        name = "Terra",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "149,6 milhões de km",
        diameter = "12.742 km",
        characteristics = "Nosso lar. O único planeta conhecido por abrigar vida, com água líquida em sua superfície e uma atmosfera rica em oxigênio.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 4,
        name = "Marte",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "227,9 milhões de km",
        diameter = "6.779 km",
        characteristics = "Conhecido como o 'Planeta Vermelho' devido ao óxido de ferro em seu solo. Possui calotas polares e a maior montanha do sistema solar, o Monte Olimpo.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 5,
        name = "Júpiter",
        type = "Gigante Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "778,3 milhões de km",
        diameter = "142.984 km",
        characteristics = "O maior planeta do sistema solar. É uma esfera de gás com uma proeminente mancha vermelha, que é uma tempestade maior que a Terra.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 6,
        name = "Saturno",
        type = "Gigante Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "1,4 bilhões de km",
        diameter = "120.536 km",
        characteristics = "Famoso por seu espetacular sistema de anéis, compostos principalmente de partículas de gelo. É o planeta com a menor densidade.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 7,
        name = "Urano",
        type = "Gigante de Gelo",
        galaxy = "Via Láctea",
        distanceFromSun = "2,9 bilhões de km",
        diameter = "51.118 km",
        characteristics = "Um gigante de gelo com uma cor azul-esverdeada devido ao metano. Possui uma inclinação de eixo única, fazendo-o girar 'de lado'.",
        imageRes = R.drawable.ic_launcher_background
    ),
    Planet(
        id = 8,
        name = "Netuno",
        type = "Gigante de Gelo",
        galaxy = "Via Láctea",
        distanceFromSun = "4,5 bilhões de km",
        diameter = "49.528 km",
        characteristics = "O planeta mais distante do Sol. É conhecido por seus ventos supersônicos e sua cor azul intensa, também causada pelo metano.",
        imageRes = R.drawable.ic_launcher_background
    )
)