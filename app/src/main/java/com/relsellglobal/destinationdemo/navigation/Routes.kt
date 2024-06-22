package com.relsellglobal.destinationdemo.navigation


sealed class Routes(val route: String) {
    object ComposableOne: Routes("composable_one")
    object MainComposable: Routes("main_composable")
}