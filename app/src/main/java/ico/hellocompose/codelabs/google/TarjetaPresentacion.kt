package ico.hellocompose.codelabs.google

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ico.hellocompose.R

@Preview(showBackground = true)
@Composable
fun PreviewCardPresentation() {
    CardPresentation()
}

@Composable
fun CardPresentation() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFd2e8d4))
    ) {
        ProfileView(modifier = Modifier.align(Alignment.Center))
        ContactsView(modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun ProfileView(modifier: Modifier) {
    val color = Color(0xFF073042)
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Profile",
            modifier = Modifier
                .size(130.dp)
                .border(BorderStroke(6.dp, color), CircleShape)
                .padding(12.dp)
                .clip(CircleShape)
                .background(color),
            colorFilter = ColorFilter.tint(color, blendMode = BlendMode.Lighten)
            )
        Text(
            text = "Osvaldo Guerra",
            fontSize = 28.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(text = "Android Developer", color = Color(0xFF006530), fontSize = 18.sp)
    }
}

@Composable
fun ContactsView(modifier: Modifier) {
    Column(modifier = modifier.padding(bottom = 120.dp), horizontalAlignment = Alignment.Start) {
        ContactItem(name = "+11 (123) 444 555 666", icon = Icons.Default.Call)
        ContactItem(name = "@Osvaldo-o", icon = Icons.Default.Share)
        ContactItem(name = "osvaldolanuza27@dev.com", icon = Icons.Default.Email)
    }
}

@Composable
fun ContactItem(name: String, icon: ImageVector) {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 10.dp)) {
        Icon(icon, contentDescription = "icon", tint = Color(0xFF036e3d), modifier = Modifier.size(28.dp))
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = name, fontSize = 18.sp)
    }
}














