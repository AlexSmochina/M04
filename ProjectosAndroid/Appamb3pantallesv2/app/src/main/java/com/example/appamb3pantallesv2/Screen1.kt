package com.example.appamb3pantallesv2

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Screen1(navController: NavHostController) {
    var texto by remember { mutableStateOf("")}
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Text(text = "Pantalla 1", modifier = Modifier.align(Alignment.Center))
    }
    ConstraintLayout (modifier = Modifier.fillMaxSize()){
        val (continuar) =createRefs()
        Box(modifier = Modifier
            .size(60.dp)
            .background(Color.Blue)
            .clickable { navController.navigate(Routes.Pantalla2.route) }
            .constrainAs(continuar){
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
            },
            contentAlignment = Alignment.Center){
            Text(text = "Continuar",
                modifier = Modifier
                    .fillMaxSize(),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                color = Color.White
        )}
    }
}
