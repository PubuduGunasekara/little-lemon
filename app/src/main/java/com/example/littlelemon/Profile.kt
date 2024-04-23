package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Profile(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Header with logo image
        ProfileHeader()

        // Profile information
        Text("Profile information:")

        // Display user data
        DisplayUserData()

        // Log out button
        LogoutButton(navController = navController)
    }
}

@Composable
fun LogoutButton(navController: NavController) {
    Button(
        onClick = {
            // Clear shared preferences data here

            // Navigate to Onboarding screen
            navController.navigate("Onboarding")
        },
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
    ) {
        Text("Log out")
    }
}


@Composable
fun ProfileHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier.size(100.dp)
        )
    }
}

@Composable
fun DisplayUserData() {
    // Retrieve user data from SharedPreferences
    val firstName = "John"
    val lastName = "Doe"
    val email = "john.doe@example.com"

    // Display user data
    Column(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text("First Name: $firstName")
        Text("Last Name: $lastName")
        Text("Email: $email")
    }
}
/*
@Preview
@Composable
fun ProfilePreview() {
    Profile()
}*/