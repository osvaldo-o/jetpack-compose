package ico.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ico.hellocompose.codelabs.google.AppArtSpace
import ico.hellocompose.codelabs.google.affirmation.ui.AffirmationApp
import ico.hellocompose.codelabs.google.courses.ui.AppCourses
import ico.hellocompose.codelabs.google.superhero.ui.screens.SuperHeroesApp
import ico.hellocompose.codelabs.google.superhero.ui.theme.SuperheroesTheme
import ico.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                   SuperHeroesApp()
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    SuperheroesTheme {
        SuperHeroesApp()
    }
}