package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
//@Preview
fun Onboarding(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Header with logo image
        OnboardingHeader()

        // Prompt for user details
        Text("Let's get to know you",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center)

        // TextFields for user input
        PersonalDetailsInput()

        // Register button
        RegisterButton(navController)
    }
}
@Composable
fun RegisterButton(navController: NavHostController) {
    val firstName = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }

    Button(
        onClick = {
            if (firstName.value.isBlank() || lastName.value.isBlank() || email.value.isBlank()) {
                // Display error message if any field is empty
                // Update the UI state accordingly
                // You can use a Toast, Snackbar, or Text message to show the error
                // For simplicity, let's use a Text message
                // Display this message to the user if any field is empty
                // Display this message if all fields are filled and registration is successful
            } else {
                // Save user details to SharedPreferences
                // Navigate to Home screen
                navController.navigate(NavigationDestinations.home)
            }
        },
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
            .background(Color.Yellow) // Add yellow background color to the button
    ) {
        Text("Register")
    }
}
@Composable
fun OnboardingHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
            .background(Color.White),
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
fun PersonalDetailsInput() {
    val firstNameState = remember { mutableStateOf("") }
    val lastNameState = remember { mutableStateOf("") }
    val emailState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(vertical = 16.dp)
    ) {
        Text("First Name")
        TextField(
            value = firstNameState.value,
            onValueChange = { firstNameState.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        Text("Last Name")
        TextField(
            value = lastNameState.value,
            onValueChange = { lastNameState.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        Text("Email Address")
        TextField(
            value = emailState.value,
            onValueChange = { emailState.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }
}
