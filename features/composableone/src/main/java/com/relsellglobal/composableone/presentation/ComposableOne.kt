package com.relsellglobal.composableone.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.relsellglobal.common.ui.theme.DestinationDemoTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposableOne(navigator: NavController) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    DestinationDemoTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Destination Demo Detail") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary, // Customize your background color here
                        titleContentColor = Color.White // Customize your title color here
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            //navigator.navigate(ComposableOneDestination())
                            navigator.popBackStack()
                        }) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                )
            },

            floatingActionButton = {
                FloatingActionButton(onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar("FAB Clicked")
                    }
                }) {
                    Icon(Icons.Default.Add, contentDescription = "Add")
                }
            },
            snackbarHost = { SnackbarHost(snackbarHostState) },
            content = { padding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = "Composable1"
                        )
                        Button(onClick = {
//                        navigator.navigate(ComposableTwoDestination())
                        }) {
                            Text("Press me")
                        }
                    }
                }
            }
        )
    }
}


