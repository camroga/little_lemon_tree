package com.example.littlelemonlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonlogin.ui.theme.LittleLemonLoginTheme

class Checkout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun OrderScreen() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF495E57))
    ) {

        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp)
        )
        Text(
            text = "Chicago",
            fontSize = 32.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, color = Color.Red),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
        ) {
            Text(text = "Login", color = Color(0xFFEDEFEE))
        }
        Image(
            painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = "Logo Image",
            Modifier.height(100.dp)
        )
    }
}

@Preview
@Composable
fun OrderPreview() {
    OrderScreen()
}