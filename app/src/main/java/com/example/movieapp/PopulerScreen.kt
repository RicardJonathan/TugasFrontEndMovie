import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieapp.data.DummyData
import com.example.movieapp.model.Populer
import com.example.movieapp.ui.theme.MovieAppTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PopulerScreen(
    modifier: Modifier = Modifier,
    populers: List<Populer> = DummyData.listPopuler
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "PopulerScreen") },
                backgroundColor = Color.White // Mengubah warna TopAppBar menjadi putih
            )
        },
        content = { contentPadding ->
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Adaptive(160.dp),
                verticalItemSpacing = 4.dp,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(contentPadding) // Apply padding here
            ) {
                items(populers, key = { it.id }) { populer ->
                    Image(
                        painter = painterResource(id = populer.photo),
                        contentDescription = populer.name,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .shadow(4.dp, shape = RoundedCornerShape(8.dp), clip = true)
                    )
                }
            }
        }
    )
}

@Preview(showSystemUi = true)
@Composable
private fun PopulerScreenPreview() {
    MovieAppTheme {
        PopulerScreen(populers = DummyData.listPopuler)
    }
}
