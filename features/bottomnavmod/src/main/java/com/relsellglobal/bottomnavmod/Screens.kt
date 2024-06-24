import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.relsellglobal.common.Screen

//package com.relsellglobal.bottomnavmod
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.navigation.NavController
//import com.relsellglobal.common.HomeScreen
//import com.relsellglobal.common.ProfileScreen
//import com.relsellglobal.common.SettingsScreen
//
//@Composable
//fun HomeMainScreen(navController: NavController) {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text = "Home Main Screen")
//            Button(onClick = { navController.navigate(HomeScreen.ComposableOne.route) }) {
//                Text(text = "Go to Details")
//            }
//        }
//    }
//}
//
//@Composable
//fun HomeDetailsScreen() {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text(text = "Home Details Screen")
//    }
//}
//
//@Composable
//fun ProfileMainScreen(navController: NavController) {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text = "Profile Main Screen")
//            Button(onClick = { navController.navigate(ProfileScreen.Details.route) }) {
//                Text(text = "Go to Details")
//            }
//        }
//    }
//}
//
//@Composable
//fun ProfileDetailsScreen() {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text(text = "Profile Details Screen")
//    }
//}
//
//@Composable
//fun SettingsMainScreen(navController: NavController) {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text = "Settings Main Screen")
//            Button(onClick = { navController.navigate(SettingsScreen.Details.route) }) {
//                Text(text = "Go to Details")
//            }
//        }
//    }
//}
//
//@Composable
//fun SettingsDetailsScreen() {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text(text = "Settings Details Screen")
//    }
//}

@Composable
fun HomeMainScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Home Main Screen")
            Button(onClick = { navController.navigate(Screen.HomeDetails.route) }) {
                Text(text = "Go to Details")
            }
        }
    }
}

@Composable
fun HomeDetailsScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Home Details Screen")
    }
}

@Composable
fun ProfileMainScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Profile Main Screen")
            Button(onClick = { navController.navigate(Screen.ProfileDetails.route) }) {
                Text(text = "Go to Details")
            }
        }
    }
}

@Composable
fun ProfileDetailsScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Profile Details Screen")
    }
}

@Composable
fun SettingsMainScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Settings Main Screen")
            Button(onClick = { navController.navigate(Screen.SettingsDetails.route) }) {
                Text(text = "Go to Details")
            }
        }
    }
}

@Composable
fun SettingsDetailsScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Settings Details Screen")
    }
}
