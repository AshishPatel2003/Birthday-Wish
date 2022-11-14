package com.example.birthdaywish

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaywish.ui.theme.BirthdayWishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayWishTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),color = Color.Cyan) {
                    Birthday("Varada", "Ashish")
                }
            }
        }
    }
}

@Composable
fun Birthday(name : String, from : String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.cake), contentDescription = null)
        Text(text = "Happy Birthday $name", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(30.dp, 20.dp))
        Text(text = "- From $from", fontSize = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayWishTheme {
        Birthday("Devanshi", "Ashish")
    }
}