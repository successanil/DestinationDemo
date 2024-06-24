package com.relsellglobal.destinationdemo.navigation

import BottomNavigationBar
import HomeDetailsScreen
import HomeMainScreen
import ProfileDetailsScreen
import ProfileMainScreen
import SettingsDetailsScreen
import SettingsMainScreen
import TopAppBarCustom
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.relsellglobal.common.Screen
import currentRoute

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val currentRoute = currentRoute(navController)

    Scaffold(
        topBar = { TopAppBarCustom(navController, currentRoute) },
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { innerPadding ->
        NavHost(navController, startDestination = Screen.Home.route, Modifier.padding(innerPadding)) {
            composable(Screen.Home.route) { HomeMainScreen(navController) }
            composable(Screen.HomeDetails.route) { HomeDetailsScreen() }
            composable(Screen.Profile.route) { ProfileMainScreen(navController) }
            composable(Screen.ProfileDetails.route) { ProfileDetailsScreen() }
            composable(Screen.Settings.route) { SettingsMainScreen(navController) }
            composable(Screen.SettingsDetails.route) { SettingsDetailsScreen() }
        }
    }
}




