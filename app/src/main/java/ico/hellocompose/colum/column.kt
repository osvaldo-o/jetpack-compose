package ico.hellocompose.colum

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ico.hellocompose.ui.theme.HelloComposeTheme

@Composable
fun MyColumn() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Hi!", Modifier.background(Color.Green).fillMaxWidth(), color = Color.White)
        Text(text = "Hi!", Modifier.background(Color.Red).fillMaxWidth(), color = Color.White)
        Text(text = "Hi!", Modifier.background(Color.Blue).fillMaxWidth(), color = Color.White)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewColumn() {
    HelloComposeTheme {
        MyColumn()
    }
}