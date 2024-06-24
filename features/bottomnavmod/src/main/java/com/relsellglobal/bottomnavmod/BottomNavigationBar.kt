import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.relsellglobal.common.Screen

//package com.relsellglobal.bottomnavmod
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.automirrored.filled.ArrowBack
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.NavigationBar
//import androidx.compose.material3.NavigationBarItem
//import androidx.compose.material3.NavigationBarItemDefaults
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import androidx.navigation.NavGraph.Companion.findStartDestination
//import androidx.navigation.compose.currentBackStackEntryAsState
//import com.relsellglobal.common.HomeScreen
//import com.relsellglobal.common.ProfileScreen
//import com.relsellglobal.common.Screen
//import com.relsellglobal.common.SettingsScreen
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TopAppBarCustom(navController: NavController, currentRoute: String?) {
//    val canNavigateBack = currentRoute in listOf(
//        HomeScreen.ComposableOne.route,
//        ProfileScreen.Details.route,
//        SettingsScreen.Details.route
//    )
//
//    TopAppBar(
//        title = { Text(getTitle(currentRoute)) },
//        navigationIcon = {
//            if (canNavigateBack) {
//
//                IconButton(onClick = { navController.popBackStack() }) {
//                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
//                }
//
//            } else null
//        },
//        colors = topAppBarColors(
//            containerColor = MaterialTheme.colorScheme.primary
//        )
//    )
//}
//
//@Composable
//fun getTitle(route: String?): String {
//    return when (route) {
//        Screen.Home.route -> "Home"
//        Screen.Profile.route -> "Profile"
//        Screen.Settings.route -> "Settings"
//        HomeScreen.ComposableOne.route -> "Home Details"
//        ProfileScreen.Details.route -> "Profile Details"
//        SettingsScreen.Details.route -> "Settings Details"
//        else -> "App"
//    }
//}
//
//@Composable
//fun BottomNavigationBar(navController: NavController, currentRoute: String?) {
//    val items = listOf(
//        Screen.Home,
//        Screen.Profile,
//        Screen.Settings
//    )
//    NavigationBar {
//        items.forEach { screen ->
//            val isSelected = currentRoute == screen.route
//            NavigationBarItem(
//                icon = {
//                    if (isSelected) {
//                        Box(
//                            modifier = Modifier
//                                .size(24.dp)
//                                .background(MaterialTheme.colorScheme.primary, shape = CircleShape)
//                        ) {
//                            Icon(
//                                screen.icon,
//                                contentDescription = null,
//                                tint = MaterialTheme.colorScheme.onPrimary
//                            )
//                        }
//                    } else {
//                        Icon(screen.icon, contentDescription = null)
//                    }
//                },
//                label = { Text(stringResource(id = screen.resourceId)) },
//                selected = isSelected,
//                onClick = {
//                    navController.navigate(screen.route) {
//                        // Pop up to the start destination of the graph to
//                        // avoid building up a large stack of destinations
//                        // on the back stack as users select items
//                        popUpTo(navController.graph.findStartDestination().id) {
//                            saveState = true
//                        }
//                        // Avoid multiple copies of the same destination when
//                        // reselecting the same item
//                        launchSingleTop = true
//                        // Restore state when reselecting a previously selected item
//                        restoreState = true
//                    }
//                },
//                colors = NavigationBarItemDefaults.colors(
//                    selectedIconColor = MaterialTheme.colorScheme.primary,
//                    unselectedIconColor = MaterialTheme.colorScheme.onSurface,
//                    selectedTextColor = MaterialTheme.colorScheme.primary,
//                    unselectedTextColor = MaterialTheme.colorScheme.onSurface
//                )
//            )
//        }
//    }
//}
//
//@Composable
//fun currentRoute(navController: NavController): String? {
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    return navBackStackEntry?.destination?.route
//}
//
//@Composable
//fun selectedRoute(navController: NavController): String? {
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    return navBackStackEntry?.destination?.route
//}
//

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCustom(navController: NavController, currentRoute: String?) {
    val canNavigateBack = currentRoute in listOf(
        Screen.HomeDetails.route,
        Screen.ProfileDetails.route,
        Screen.SettingsDetails.route
    )

    androidx.compose.material3.TopAppBar(
        title = { Text(getTitle(currentRoute)) },
        navigationIcon = {
            if (canNavigateBack) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
            } else null
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}

@Composable
fun getTitle(route: String?): String {
    return when (route) {
        Screen.Home.route -> "Home"
        Screen.Profile.route -> "Profile"
        Screen.Settings.route -> "Settings"
        Screen.HomeDetails.route -> "Home Details"
        Screen.ProfileDetails.route -> "Profile Details"
        Screen.SettingsDetails.route -> "Settings Details"
        else -> "App"
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        Screen.Home,
        Screen.Profile,
        Screen.Settings
    )
    NavigationBar {
        val currentRoute = currentRoute(navController)
        items.forEach { screen ->
            val isSelected = currentRoute == screen.route
            NavigationBarItem(
                icon = {
                    Icon(screen.icon, contentDescription = null)
                },
                label = { Text(stringResource(id = screen.resourceId)) },
                selected = isSelected,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Composable
fun currentRoute(navController: NavController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}