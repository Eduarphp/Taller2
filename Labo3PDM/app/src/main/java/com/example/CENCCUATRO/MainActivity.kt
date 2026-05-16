package com.example.CENCCUATRO

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.CENCCUATRO.ui.theme.Labo2PDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Labo2PDMTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onListaClick = {
                    navController.navigate("lista")
                },
                onSensorClick = {
                    navController.navigate("sensor")
                }
            )
        }

        composable("lista") {
            ListHome(
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        composable("sensor") {
            SensorScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}