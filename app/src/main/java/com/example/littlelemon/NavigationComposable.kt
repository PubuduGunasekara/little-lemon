package com.example.littlelemon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = determineStartDestination()) {
        composable(NavigationDestinations.onboarding) {
            Onboarding(navController)
        }
        composable(NavigationDestinations.home) {
            Home(navController)
        }
        composable(NavigationDestinations.profile) {
            Profile(navController)
        }
    }
}

private fun determineStartDestination(): String {
    // Logic to determine start destination based on user data (from shared preferences)
    /*return if (/* User is logged in */) {
        NavigationDestinations.home
    } else {
        NavigationDestinations.onboarding
    }*/
    return String()
}