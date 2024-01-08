package com.example.appamb3pantallesv2

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun Screen3(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)
        .clickable { navController.navigate(Routes.Pantalla1.route) }
    ) {
        Text(text = "Pantalla 3", modifier = Modifier.align(Alignment.Center))
    }
}