package ico.hellocompose.ejercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ico.hellocompose.ui.theme.HelloComposeTheme
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Blue), contentAlignment = Alignment.Center) {
            Text(text = "Ejemplo 1")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Box(modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Red), contentAlignment = Alignment.Center) {
                Text(text = "Ejemplo 2")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Green), contentAlignment = Alignment.Center) {
                Text(text = "Ejemplo 3")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Magenta), contentAlignment = Alignment.BottomCenter) {
            Text(text = "Ejemplo 4")
        }
    }
}