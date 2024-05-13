package com.example.movieapp.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieapp.R
import com.example.movieapp.model.Series
import com.example.movieapp.ui.theme.MovieAppTheme


@Composable
fun SeriesItem(
    series: Series,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = series.photo),
                contentDescription = series.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp) // Set a fixed size for the image
                    .clip(RoundedCornerShape(16.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = series.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = series.eps,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = series.genre,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    MovieAppTheme {
        SeriesItem(
            series = Series(
                2,
                "Last Of Us",
                "14 episodes",
                "Action",
                R.drawable.lastofus
            )
        )
    }
}