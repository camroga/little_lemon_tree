package com.example.littlelemon

import ScrollableGalleryScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                AppScreen()
            }
        }
    }
}

@Composable
fun AppScreen() {
    ScrollableGalleryScreen()
}

