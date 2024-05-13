import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapp.data.DummyData
import com.example.movieapp.model.About
import com.example.movieapp.ui.theme.MovieAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
    abouts: List<About> = DummyData.profilAbout
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black
                ),
                title = {
                    Text("AboutScreen")
                }
            )
        },
        content = { padding ->
            Card(
                modifier = modifier
                    .fillMaxSize()
                    .padding(padding),
                shape = MaterialTheme.shapes.medium
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(), // Fill the entire card
                    verticalArrangement = Arrangement.Center // Center the content vertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(120.dp)
                            .align(Alignment.CenterHorizontally) // Center the image horizontally
                    ) {
                        Image(
                            painter = painterResource(id = abouts.first().photo),
                            contentDescription = "Profile Photo",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape)
                                .align(Alignment.TopCenter)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Name: ${abouts.first().name}",
                        style = MaterialTheme.typography.labelLarge,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the text horizontally
                    )
                    Text(
                        text = "Email: ${abouts.first().email}",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the text horizontally
                    )
                    Text(
                        text = "University: ${abouts.first().univ}",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the text horizontally
                    )
                    Text(
                        text = "Jurusan: ${abouts.first().jurusan}",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the text horizontally
                    )
                }
            }
        }
    )
}

@Preview(showSystemUi = true)
@Composable
private fun AboutScreenPreview() {
    MovieAppTheme {
        AboutScreen()
    }
}