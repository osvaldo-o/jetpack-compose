package ico.hellocompose.button


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyButton() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button Filled")
        }
        Spacer(modifier = Modifier.height(8.dp))
        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text(text = "Button Tonal")
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Button Outlined")
        }
        Spacer(modifier = Modifier.height(8.dp))
        ElevatedButton(onClick = { /*TODO*/ }) {
            Text(text = "Button Elevated")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Text Button")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            border = BorderStroke(2.dp, Color.Cyan)
        )
            {
                Text(text = "Custom Button", fontWeight = FontWeight.ExtraBold)
            }
    }
}