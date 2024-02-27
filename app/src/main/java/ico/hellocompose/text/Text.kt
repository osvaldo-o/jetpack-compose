package ico.hellocompose.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Hello text")
        Text(text = "Hello text", color = Color.Blue)
        Text(text = "Hello text", fontWeight = FontWeight.ExtraBold)
        Text(text = "Hello text", fontFamily = FontFamily.Cursive, fontSize = 20.sp)
        Text(text = "Hello text", textDecoration = TextDecoration.LineThrough)
    }
}