package drawable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ico.hellocompose.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyImage() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "example",
            modifier = Modifier.clip(RoundedCornerShape(100f))
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyIcon() {
    Icon(Icons.Rounded.AccountCircle, contentDescription = "Icon")
}