package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Image Composable with the hero image
        Image(
            painter = painterResource(id = R.drawable.hero_image),
            contentDescription = "Hero Image",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Restaurant details
        Text(
            text = "Restaurant Name: Little Lemon",
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "City: Chicago",
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Short Description: We are a family-owned Mediterranean restaurant, focused on traditional recipes served with a modern twist",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Header containing an Image Composable with the profile.png file asset
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(50.dp)
                    .clickable { navController.navigate("Profile") } // Navigate to Profile screen
            )
        }
    }
}

