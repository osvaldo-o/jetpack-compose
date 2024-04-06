package ico.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ico.hellocompose.codelabs.google.starwars.ui.AppStarWars
import ico.hellocompose.codelabs.google.starwars.ui.theme.StarWarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarWarsTheme {
                Surface() {
                   AppStarWars()
                }
            }
        }
    }
}


@Preview()
@Composable
fun GreetingPreview() {
    StarWarsTheme {
        AppStarWars()
    }
}