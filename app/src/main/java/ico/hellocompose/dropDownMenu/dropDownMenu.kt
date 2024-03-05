package ico.hellocompose.dropDownMenu

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDropDownMenu() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
        var selectedState by remember {
            mutableStateOf("")
        }
        var expanded by remember {
            mutableStateOf(false)
        }
        OutlinedTextField(
            value = selectedState,
            onValueChange = {selectedState = it},
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    expanded = true
                }
        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }, Modifier.fillMaxWidth()) {
            for (i in 1 ..6) {
                DropdownMenuItem(
                    text = { Text(text = "$i")},
                    onClick = {
                        expanded = false
                        selectedState = "$i"
                    }
                )
            }
        }
    }
}