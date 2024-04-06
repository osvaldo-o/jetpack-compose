package ico.hellocompose.codelabs.google.starwars.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ico.hellocompose.codelabs.google.starwars.datasource.DataSource
import ico.hellocompose.codelabs.google.starwars.model.Character

@Composable
fun AppStarWars() {
    ScreenStarWars(characters = DataSource.persons)
}

@Composable
private fun ScreenStarWars(characters: List<Character>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(22.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp),
    ) {
        items(characters) {
            CardCharacter(character = it)
        }
    }
}

@Composable
private fun CardCharacter(character: Character, modifier: Modifier = Modifier) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary),
        elevation = CardDefaults.cardElevation(14.dp),
    ) {
        Column(
            Modifier
                .padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = character.name),
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier.padding(start = 18.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                ExpandedIconButton(expanded = expanded) {
                    expanded = !expanded
                }
            }
            ImageCharacter(imageCharacter = character.image, nameCharacter = character.name)
            if (expanded) {
                DescriptionCharacter(description = stringResource(id = character.description))
            }
        }
    }
}

@Composable
private fun ImageCharacter(
    modifier: Modifier = Modifier,
    @DrawableRes imageCharacter: Int,
    @StringRes nameCharacter: Int
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = imageCharacter),
            contentDescription = stringResource(id = nameCharacter),
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .clip(MaterialTheme.shapes.large)
        )
    }
}

@Composable
private fun ExpandedIconButton(
    expanded: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    IconButton(
        onClick = { onClick() },
        modifier = modifier
    ) {
        val icon = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore
        Icon(
            imageVector = icon,
            contentDescription = "Icon Expanded",
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
private fun DescriptionCharacter(
    description: String,
    modifier: Modifier = Modifier
) {
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = description,
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier,
        textAlign = TextAlign.Justify
    )
}