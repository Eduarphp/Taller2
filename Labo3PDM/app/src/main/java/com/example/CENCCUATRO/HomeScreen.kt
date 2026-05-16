package com.example.CENCCUATRO

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onListaClick: () -> Unit,
    onSensorClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Laboratorio 3",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Navegación y sensores móviles",
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = onListaClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver listado de nombres")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = onSensorClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver información de sensores")
            }
        }
    }
}