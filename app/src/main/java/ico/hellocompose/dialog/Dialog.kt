package ico.hellocompose.dialog

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import ico.hellocompose.R

@Composable
fun MyDialog(show: Boolean, clear: () -> Unit) {
    if (show) {
        AlertDialog(
            onDismissRequest = { clear() },
            confirmButton = {
                TextButton(onClick = { clear() }) {
                Text(text = "Confirm")
            }},
            title = { Text(text = "Hi") },
            text = { Text(text = "Welcome!!") }
        )
    }
}

@Composable
@Preview
fun StateDialog() {
    var show by remember {
        mutableStateOf(false)
    }
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = { show = true }) {
            Text(text = "Dialog")
        }
        SimpleDialogGoogle(show = show, onDismiss = {show = false})
    }
}

@Composable
fun SimpleDialogGoogle(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Column(
                Modifier
                    .background(Color.White)
                    .padding(24.dp)
                    .fillMaxWidth()) {
                Text(text = "Set backup account", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                Spacer(modifier = Modifier.height(10.dp))
                for (i in 1..3) {
                    itemUser(email = "osvaldo@unam.mx", drawer = R.drawable.ic_launcher_background)
                }
            }
        }
    }
}

@Composable
fun itemUser(email: String, @DrawableRes drawer: Int) {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = drawer),
            contentDescription = "user image",
            modifier = Modifier
                .padding(8.dp)
                .size(40.dp)
                .clip(CircleShape)
        )
        Text(text = email, fontWeight = FontWeight.Light, modifier = Modifier.padding(start = 6.dp))
    }
}
