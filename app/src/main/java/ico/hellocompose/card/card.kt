package ico.hellocompose.card

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MyCard() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(120.dp).padding(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp))
    {
        Text(text = "Title", fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold, modifier = Modifier.padding(12.dp))
    }
}
