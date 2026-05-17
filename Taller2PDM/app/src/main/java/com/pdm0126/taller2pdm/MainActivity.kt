package com.pdm0126.taller2pdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdm0126.taller2pdm.navigation.AppNavigation
import com.pdm0126.taller2pdm.ui.theme.Taller2PDMTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            Taller2PDMTheme {

                AppNavigation()

            }
        }
    }
}