
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.movieapp.data.DummyData
import com.example.movieapp.model.Movie

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailMovieScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    moviesId: Int?
) {
    val newMoviesList = DummyData.listMovies.filter { movie ->
        movie.id == moviesId
    }

    if (newMoviesList.isNotEmpty()) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Detail Movie") },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                )
            }
        ) { innerPadding ->
            DetailMoviesContent(
                newMoviesList = newMoviesList,
                modifier = Modifier.padding(innerPadding)
            )
        }
    } else {
        Text(text = "Film tidak ditemukan", modifier = Modifier.fillMaxSize())
    }
}

@Composable
private fun DetailMoviesContent(
    newMoviesList: List<Movie>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(20.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        backgroundColor = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            val painter = rememberImagePainter(data = newMoviesList[0].photo)
            androidx.compose.foundation.Image(
                painter = painter,
                contentDescription = "Movie poster",
                modifier = Modifier
                    .size(height = 250.dp, width = 170.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .align(Alignment.CenterHorizontally)
                   // Center the image vertically
                    .padding(bottom = 16.dp),
            )

            Text(
                text = newMoviesList[0].name,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Genre: ${newMoviesList[0].genre}",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Deskripsi: ${newMoviesList[0].description}",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailMoviesContentPreview() {
    DetailMoviesContent(newMoviesList = DummyData.listMovies)
}
