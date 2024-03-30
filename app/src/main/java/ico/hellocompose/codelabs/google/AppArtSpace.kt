package ico.hellocompose.codelabs.google

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ico.hellocompose.R

@Composable
fun AppArtSpace() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val list = getPictures()
        var index by remember {
            mutableIntStateOf(1)
        }
        Column(
            Modifier
                .weight(3f)
                .fillMaxHeight(), verticalArrangement = Arrangement.Center) {
            ImageArtView(image =  list[index].image)
        }
        Column(Modifier.weight(1f), verticalArrangement = Arrangement.SpaceBetween) {
            InfoPictureView(picture = list[index])
            ButtonsView(index = index, size = list.size-2, onPrevious = {index--}, onNext = {index++})
        }
    }
}

@Composable
fun ImageArtView(modifier: Modifier = Modifier, @DrawableRes image: Int) {
    Surface(
        modifier = modifier,
        shadowElevation = 10.dp
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Image picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
        )
    }
}

@Composable
fun InfoPictureView(picture: Picture) {
    Box(
        Modifier
            .background(Color(0xFFecebf4))
            .fillMaxWidth()) {
        Column(
            Modifier
                .padding(26.dp)
        ) {
            Text(text = picture.namePicture, fontSize = 28.sp, fontFamily = FontFamily.SansSerif)
            Text(buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(picture.nameArtist)
                }
                append(" (${picture.date})")
            })
        }
    }
}

@Composable
fun ButtonsView(index: Int, size: Int, onPrevious: () -> Unit, onNext: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp, vertical = 10.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { onPrevious() }, enabled = index >= 1, modifier = Modifier.weight(2f)) {
                Text(text = "Previous",)
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { onNext() }, enabled = index <= size, modifier = Modifier.weight(2f)) {
                Text(text = "Next")
        }
    }
}

fun getPictures() =
    mutableStateListOf<Picture>(
        Picture("La joven de la perla", "Johannes Vermeer", "1665", R.drawable.picture_1),
        Picture("La noche estrellada", "Vincent van Gogh", "1889", R.drawable.picture_2),
        Picture("La Gioconda", "Leonardo da Vinci", "1503", R.drawable.picture_3),
        Picture("La gran ola de Kanagawa", "Katsushika Hokusai", "1831",R.drawable.picture_4)
    )

data class Picture(val namePicture: String, val nameArtist: String, val date: String, val image: Int)