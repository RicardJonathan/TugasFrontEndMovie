package com.example.movieapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieapp.R
import com.example.movieapp.model.Movie
import com.example.movieapp.ui.theme.MovieAppTheme

@Composable
fun MovieItem(
    movie: Movie,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = modifier.clickable { onItemClicked(movie.id) }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = movie.photo),
                contentDescription = movie.name,
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = movie.name,
                style = androidx.compose.material3.MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.size(4.dp))
            Text(
                text = movie.genre,
                style = androidx.compose.material3.MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MovieItemPreview() {
    MovieAppTheme {
        MovieItem(
            movie = Movie(
                2,
                "Batman",
                "The Dark Knight Rises adalah sebuah film pahlawan super Amerika Serikat tahun 2012 yang disutradarai oleh Christopher Nolan yang juga ikut menulis skenario bersama Jonathan Nolan dan cerita bersama David S. Goyer. Berdasarkan karakter Batman, film ini merupakan yang ketiga dan terakhir dalam trilogi film Batman besutan Nolan, dan merupakan sekuel dari Batman Begins (2005) dan The Dark Knight (2008). Christian Bale, Michael Caine, Gary Oldman, dan Morgan Freeman kembali memerankan tokoh yang mereka bawakan dalam dua film sebelumnya. Film ini memperkenalkan dua tokoh baru; Selina Kyle (Anne Hathaway)",
                "Action",
                R.drawable.batman
            )
        ) { movieId ->
            println("Mentor Id : $movieId")
        }
    }
}
