package ico.hellocompose.codelabs.google.courses.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ico.hellocompose.R
import ico.hellocompose.codelabs.google.courses.datasource.DataSource
import ico.hellocompose.codelabs.google.courses.model.Topic

@Composable
fun AppCourses() {
    LazyGridTopic(list = DataSource.topics)
}

@Composable
fun LazyGridTopic(modifier: Modifier = Modifier, list: List<Topic>) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = modifier.fillMaxSize().padding(8.dp),
        verticalItemSpacing = 8.dp,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (i in 1..3) {
            items(list) {
                ItemView(topic = it)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewItemView() {
    ItemView(topic = Topic(R.string.photography, 321, R.drawable.photography), modifier = Modifier.padding(12.dp))
}

@Composable
fun ItemView(topic: Topic, modifier: Modifier = Modifier) {
    Card(modifier = modifier, elevation = CardDefaults.elevatedCardElevation(6.dp)) {
        Row {
            Image(
                painter = painterResource(id = topic.image),
                contentDescription = stringResource(id = topic.name),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
            )
            Column()
            {
                Text(
                    text = stringResource(id = topic.name),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.icono_courses),
                        contentDescription = "icon",
                        modifier = Modifier.padding(start = 16.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "${topic.amount}", style = MaterialTheme.typography.labelMedium)
                }
            }
        }
    }
}