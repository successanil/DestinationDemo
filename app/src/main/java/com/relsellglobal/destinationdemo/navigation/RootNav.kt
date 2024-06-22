package com.relsellglobal.destinationdemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.relsellglobal.composableone.presentation.ComposableOne
import com.relsellglobal.destinationdemo.MainComposable

@Composable
fun RootNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.MainComposable.route) {
        composable(Routes.ComposableOne.route) { ComposableOne(navigator = navController) }
        composable(Routes.MainComposable.route) { MainComposable(navigator = navController) }
    }
}


