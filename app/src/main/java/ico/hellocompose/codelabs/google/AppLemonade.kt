package ico.hellocompose.codelabs.google

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ico.hellocompose.R

@Composable
fun AppLemonade() {
    var state by remember {
        mutableIntStateOf(0)
    }
    val texts = listOf<Int>(R.string.lemon_tree, R.string.lemon_squeeze, R.string.lemon_drink, R.string.lemon_restart)
    val images = listOf<Int>(R.drawable.lemon_tree, R.drawable.lemon_squeeze, R.drawable.lemon_drink, R.drawable.lemon_restart)
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            border = BorderStroke(2.dp, Color.White),
            shape = RoundedCornerShape(22.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFa0dae1)),
            modifier = Modifier
                .clickable {
                    if(state >= images.size - 1) {
                        state = 0
                    } else {
                        state++
                    }
                }
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = images[state]),
                contentDescription = "lemonade",
                modifier = Modifier
                    .padding(22.dp)
            )
        }
        Text(text = stringResource(id = texts[state]), fontSize = 18.sp)
    }
}