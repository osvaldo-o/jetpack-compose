package ico.hellocompose.control

import android.widget.RadioButton
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.selects.select

@Composable
fun MyRadioButton() {
    var states by rememberSaveable {
        mutableIntStateOf(1)
    }
    for (i in 1..6) {
        Row {
            RadioButton(selected = states == i, onClick = { states = i })
            Text(text = "$i", modifier = Modifier.padding(vertical = 16.dp))
        }
    }

}