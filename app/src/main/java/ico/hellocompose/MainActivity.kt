package ico.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ico.hellocompose.button.MyButton
import ico.hellocompose.control.CheckInfo
import ico.hellocompose.control.MyCheckBoxWithText
import ico.hellocompose.control.MyRadioButton
import ico.hellocompose.progressbar.MyProgress
import ico.hellocompose.progressbar.MyProgressAdvance
import ico.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(Modifier.fillMaxSize()) {
                        for (i in 1.. 3) {
                            MyCard()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MainComposable() {
    getOptions(titles = listOf("checkbox 1", "checkbox 2", "checkbox 3")).forEach {
        MyCheckBoxWithText(checkInfo = it)
    }
}

@Composable
fun getOptions(titles: List<String>) : List<CheckInfo> = titles.map {
    var status by rememberSaveable {
        mutableStateOf(false)
    }
    CheckInfo(title = it, selected = status, onCheckedChange = {status = !it})
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    HelloComposeTheme {
        Column(Modifier.fillMaxSize()) {
            for (i in 1.. 3) {
                MyCard()
            }
        }
    }
}