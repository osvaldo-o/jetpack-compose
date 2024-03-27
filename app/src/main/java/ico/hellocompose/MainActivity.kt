package ico.hellocompose

import android.os.Bundle
import android.widget.SearchView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
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
import ico.hellocompose.codelabs.retos.AppLemonade
import ico.hellocompose.codelabs.retos.DiceRollerApp
import ico.hellocompose.codelabs.retos.TrainingTipCalculator
import ico.hellocompose.control.CheckInfo
import ico.hellocompose.control.MyCheckBoxWithText
import ico.hellocompose.control.MyRadioButton
import ico.hellocompose.dialog.StateDialog
import ico.hellocompose.dropDownMenu.MyDropDownMenu
import ico.hellocompose.lazy.PreviewLazy
import ico.hellocompose.progressbar.MyProgress
import ico.hellocompose.progressbar.MyProgressAdvance
import ico.hellocompose.slider.BasicSlider
import ico.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                   TrainingTipCalculator()
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    HelloComposeTheme {
        TrainingTipCalculator()
    }
}