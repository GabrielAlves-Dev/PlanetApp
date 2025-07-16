package com.gabriel.planetapp.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gabriel.planetapp.models.Planet
import com.gabriel.planetapp.models.planetList
import com.gabriel.planetapp.ui.components.BottomNavigationBar
import com.gabriel.planetapp.ui.screens.DetailsScreen
import com.gabriel.planetapp.ui.screens.FavoritesScreen
import com.gabriel.planetapp.ui.screens.HomeScreen

sealed class BottomBarScreen(val route: String, val icon: ImageVector, val label: String) {
    object Home : BottomBarScreen(
        route = "home",
        icon = Icons.Default.Home,
        label = "Home"
    )
    object Favorites : BottomBarScreen(
        route = "favorites",
        icon = Icons.Default.Favorite,
        label = "Favoritos"
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph(
    onSettingsClick: () -> Unit,
    onHelpClick: () -> Unit
) {
    val navController: NavHostController = rememberNavController()

    var planets by remember { mutableStateOf(planetList) }

    val onFavoriteToggle = { planet: Planet ->
        val index = planets.indexOf(planet)
        if (index != -1) {
            val updatedPlanet = planet.copy(isFavorite = !planet.isFavorite)
            val newPlanets = planets.toMutableList()
            newPlanets[index] = updatedPlanet
            planets = newPlanets
        }
    }

    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomBarScreen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomBarScreen.Home.route) {
                HomeScreen(
                    planets = planets,
                    onPlanetSelected = { planet ->
                        navController.navigate("details/${planet.name}")
                    },
                    onFavoriteToggle = onFavoriteToggle,
                    onSettingsClick = onSettingsClick,
                    onHelpClick = onHelpClick
                )
            }
            composable(BottomBarScreen.Favorites.route) {
                FavoritesScreen(
                    planets = planets.filter { it.isFavorite },
                    onPlanetSelected = { planet ->
                        navController.navigate("details/${planet.name}")
                    },
                    onFavoriteToggle = onFavoriteToggle
                )
            }
            composable("details/{planetName}") { backStackEntry ->
                val planetName = backStackEntry.arguments?.getString("planetName")
                val selectedPlanet = planets.first { it.name == planetName }
                DetailsScreen(
                    planet = selectedPlanet,
                    onBackClick = { navController.navigateUp() },
                    onFavoriteToggle = onFavoriteToggle
                )
            }
        }
    }
}