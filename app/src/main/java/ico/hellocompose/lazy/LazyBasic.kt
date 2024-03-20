package ico.hellocompose.lazy

import android.graphics.drawable.PaintDrawable
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ico.hellocompose.R

@Preview
@Composable
fun PreviewLazy() {
    LazyAnimated()
}

@Composable
fun LazyBasic() {
    LazyColumn {
        item {
            Text(text = "Head")
        }
        items(10) {
            Text(text = "Item: $it")
        }
        item {
            Text(text = "Footer")
        }
    }
}

@Composable
fun LazyPictures() {
    LazyHorizontalGrid(rows = GridCells.Fixed(1), Modifier.height(200.dp), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        items(10) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun LazyAnimated() {
    Box(Modifier.fillMaxSize()) {
        val listState = rememberLazyListState()
        LazyRow(state = listState, modifier = Modifier.align(Alignment.TopStart).height(200.dp), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            items(10) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "",
                    modifier = Modifier.fillMaxHeight(),
                    contentScale = ContentScale.Crop
                )
            }
        }
        val showButton by remember {
            derivedStateOf {
                listState.firstVisibleItemIndex > 0
            }
        }
        AnimatedVisibility(visible = showButton, Modifier.align(Alignment.BottomStart)) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Pass")
            }
        }
    }
}



