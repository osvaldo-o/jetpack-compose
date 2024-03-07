package ico.hellocompose.control

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyCheckBox() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Column(Modifier.fillMaxSize()) {
        Checkbox(
            checked = state,
            onCheckedChange = {state = !state},
            colors = CheckboxDefaults.colors(checkedColor = Color.Green, uncheckedColor = Color.Red, checkmarkColor = Color.White))
    }
}

data class CheckInfo(val title: String, var selected: Boolean = false, var onCheckedChange: (Boolean) -> Unit )

@Composable
fun MyCheckBoxWithText(checkInfo: CheckInfo) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = {checkInfo.onCheckedChange(!it)})
        Text(text = checkInfo.title, Modifier.padding(vertical = 16.dp), fontWeight = FontWeight.Normal, fontSize = 16.sp)
    }
}

