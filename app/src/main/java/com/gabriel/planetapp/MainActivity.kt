package com.gabriel.planetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.gabriel.planetapp.navigation.NavGraph
import com.gabriel.planetapp.ui.theme.PlanetAppTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanetAppTheme {
                NavGraph(
                    onSettingsClick = {},
                    onHelpClick = {}
                )
            }
        }
    }
}