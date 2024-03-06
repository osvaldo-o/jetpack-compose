package ico.hellocompose.slider

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BasicSlider() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp)) {
        var value by remember {
            mutableFloatStateOf(0f)
        }
        Slider(value = value, onValueChange = {value = it})
        Text(text = value.toString())
    }
}