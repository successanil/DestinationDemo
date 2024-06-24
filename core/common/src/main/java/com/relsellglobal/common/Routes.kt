package com.relsellglobal.common

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

//sealed class Screen(val route: String, @StringRes val resourceId: Int, val icon: ImageVector) {
//    object Home : Screen("home", R.string.home, Icons.Filled.Home)
//    object Profile : Screen("profile", R.string.profile, Icons.Filled.Person)
//    object Settings : Screen("settings", R.string.settings, Icons.Filled.Settings)
//}
//
//sealed class HomeScreen(val route: String) {
//
//    object MainComposable: HomeScreen("main_composable")
//    object ComposableOne: HomeScreen("composable_one")
//
//}
//
//sealed class ProfileScreen(val route: String) {
//    object Main : ProfileScreen("profile_main")
//    object Details : ProfileScreen("profile_details")
//}
//
//sealed class SettingsScreen(val route: String) {
//    object Main : SettingsScreen("settings_main")
//    object Details : SettingsScreen("settings_details")
//}

sealed class Screen(val route: String, @StringRes val resourceId: Int, val icon: ImageVector) {
    object Home : Screen("home", R.string.home, Icons.Filled.Home)
    object Profile : Screen("profile", R.string.profile, Icons.Filled.Person)
    object Settings : Screen("settings", R.string.settings, Icons.Filled.Settings)
    object HomeDetails : Screen("home/details", R.string.home_details, Icons.Default.Info)
    object ProfileDetails : Screen("profile/details", R.string.profile_details, Icons.Default.Info)
    object SettingsDetails : Screen("settings/details", R.string.settings_details, Icons.Default.Info)
}
