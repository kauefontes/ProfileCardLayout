package dev.quewui.profilecardlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.quewui.profilecardlayout.ui.theme.ProfileCardLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        ProfileCard()
    }
}

@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = 8.dp
    ) {
        Row(modifier = Modifier.wrapContentSize()) {
            ProfilePicture()
            ProfileDetails()
        }
    }
}

@Composable
fun ProfilePicture() {
    Image(
        painter = painterResource(id = R.drawable.ic_profile_picture),
        contentDescription = "",
        modifier = Modifier.size(72.dp)
    )
}

@Composable
fun ProfileDetails() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Kaue Pereira")
        Text(text = "Quewui")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProfileCardLayoutTheme {
        MainScreen()
    }
}