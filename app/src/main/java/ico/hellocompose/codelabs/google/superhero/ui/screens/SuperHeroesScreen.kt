package ico.hellocompose.codelabs.google.superhero.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ico.hellocompose.R
import ico.hellocompose.codelabs.google.superhero.model.Hero
import ico.hellocompose.codelabs.google.superhero.repository.HeroesRepository

@Composable
fun SuperHeroesApp() {
    SuperHeroesScreen(list = HeroesRepository.heroes)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperHeroesScreen(list: List<Hero>, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = stringResource(id = R.string.app_name_super),
                    style = MaterialTheme.typography.displayLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            } )
        }
    ) {
        LazyColumn(modifier = modifier
            .fillMaxSize()
            .padding(it).padding(horizontal = 16.dp)) {
            items(list) {
                ItemSuperHeroView(hero = it, modifier = Modifier.padding(bottom = 16.dp))
            }
            items(list) {
                ItemSuperHeroView(hero = it, modifier = Modifier.padding(bottom = 16.dp))
            }
        }
    }
}

@Composable
fun ItemSuperHeroView(hero: Hero, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = modifier
    ) {
        Row(
            Modifier
                .padding(16.dp)) {
            DescriptionSuperHero(
                name = stringResource(id = hero.nameRes),
                description = stringResource(id = hero.descriptionRes),
                modifier = Modifier
                    .padding(end = 16.dp)
                    .weight(2f)
            )
            Image(
                painter = painterResource(id = hero.imageRes),
                contentDescription = stringResource(id = hero.nameRes),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.small)
                    .height(72.dp)
                    .width(72.dp)
            )
        }
    }
}

@Composable
fun DescriptionSuperHero(name: String, description: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = name, style = MaterialTheme.typography.displaySmall)
        Text(text = description, style = MaterialTheme.typography.bodyLarge)
    }
}