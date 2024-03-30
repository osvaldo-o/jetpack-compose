package ico.hellocompose.codelabs.google.affirmation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ico.hellocompose.codelabs.google.affirmation.data.Datasource
import ico.hellocompose.codelabs.google.affirmation.model.Affirmation

@Composable
fun AffirmationApp() {
    AffirmationList(affirmationList = Datasource().loadAffirmations())
}

@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxSize()) {
        items(affirmationList) {
            AffirmationCard(affirmation = it)
        }
    }
}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Card(
        modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xffe6e0eb))
    ) {
        Column {
            Image(painter = painterResource(id = affirmation.imageResourceId), contentDescription = null, modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.Crop)
            Text(text = stringResource(id = affirmation.stringResourced), modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.headlineSmall)
        }
    }
}