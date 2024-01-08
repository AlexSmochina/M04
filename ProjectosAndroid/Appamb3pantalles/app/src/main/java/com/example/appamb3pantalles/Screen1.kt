package com.example.appamb3pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun Screen1(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)
        .padding(10.dp)){
        Text(text = "Pantalla 1", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navController.navigate(Routes.Pantalla2.route) })
    }
}
