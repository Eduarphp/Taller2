package com.pdm0126.taller2pdm.screens.home


import androidx.compose.runtime.collectAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {

    val uiState = viewModel.uiState.collectAsState().value

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        uiState.groupedRestaurants.forEach { (category, restaurants) ->

            item {

                Column {

                    Text(
                        text = category,
                        style = MaterialTheme.typography.titleLarge
                    )

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        items(restaurants) { restaurant ->

                            Card(
                                modifier = Modifier.fillParentMaxWidth(0.8f)
                            ) {

                                Column(
                                    modifier = Modifier.padding(12.dp)
                                ) {

                                    AsyncImage(
                                        model = restaurant.imageUrl,
                                        contentDescription = restaurant.name,
                                        modifier = Modifier.fillMaxWidth()
                                    )

                                    Text(
                                        text = restaurant.name,
                                        style = MaterialTheme.typography.titleMedium
                                    )

                                    Text(
                                        text = restaurant.description
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}