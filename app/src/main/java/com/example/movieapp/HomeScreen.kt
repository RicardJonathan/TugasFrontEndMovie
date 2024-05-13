package com.example.movieapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.component.MovieItem
import com.example.movieapp.component.SeriesItem
import com.example.movieapp.data.DummyData
import com.example.movieapp.model.Movie
import com.example.movieapp.model.Series
import com.example.movieapp.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    movies: List<Movie> = DummyData.listMovies,
    series: List<Series> = DummyData.tvSeries,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            Text(
                text = "Movies",
                color = Color.Black,
                modifier = Modifier.padding(16.dp)
            )
        }

        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(movies, key = { it.id }) {
                    MovieItem(movie = it) { movieId ->
                        navController.navigate(Screen.Detail.route + "/$movieId")
                    }
                }
            }
        }

        item {
            Text(
                text = "TV Series",
                color = Color.Black,
                modifier = Modifier.padding(16.dp)
            )
        }

        items(series, key = { it.id }) {
            SeriesItem(series = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}
