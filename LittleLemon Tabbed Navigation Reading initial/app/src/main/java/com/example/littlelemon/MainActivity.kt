package com.example.littlelemon

import Home
import Location
import Menu
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }

    @Composable
    fun MyApp() {
        val navController = rememberNavController()
        Scaffold(bottomBar = { MyBottomNavigation(navController = navController) }) {
            Box(modifier = Modifier.padding(it)) {
                NavHost(
                    navController = navController,
                    startDestination = Home.route
                ) {
                    composable(Home.route) {
                        HomeScreen()
                    }
                    composable(Menu.route) {
                        MenuScreen()
                    }
                    composable(Location.route) {
                        LocationScreen()
                    }
                }
            }
        }
    }

    @Composable
    fun MyBottomNavigation(navController: NavController) {
        val destinations = listOf(Home, Menu, Location)
        val selectedIndex = rememberSaveable {
            mutableStateOf(0)
        }
        BottomNavigation {
            destinations.forEachIndexed { index, destination ->
                BottomNavigationItem(
                    label = { Text(destination.title) },
                    icon = {
                        Icon(
                            painter = painterResource(id = destination.icon),
                            contentDescription = destination.title
                        )
                    },
                    selected = index == selectedIndex.value,
                    onClick = {
                        selectedIndex.value = index
                        navController.navigate(destinations[index].route) {
                            launchSingleTop = true
                            popUpTo(Home.route)
                        }
                    },
                )
            }
        }

    }
}