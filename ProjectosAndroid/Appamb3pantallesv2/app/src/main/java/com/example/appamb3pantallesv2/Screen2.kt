package com.example.appamb3pantallesv2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController

@Composable
fun Screen2(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Text(text = "Pantalla 2", modifier = Modifier.align(Alignment.Center))
    }
    ConstraintLayout (modifier = Modifier.fillMaxSize()){
        val (regresar, imagen, continuar) =createRefs()
        Box(modifier = Modifier
            .size(60.dp)
            .background(Color.Red)
            .clickable { navController.navigate(Routes.Pantalla1.route) }
            .constrainAs(regresar) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }){
            Image(painter = painterResource(id = R.drawable._364354), contentDescription = "regresar")
        }
        Box(modifier = Modifier
            .size(60.dp)
            .background(Color.Red)
            .clickable { navController.navigate(Routes.Pantalla1.route) }
            .constrainAs(imagen) {
                top.linkTo(parent.top)
                start.linkTo(regresar.end)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
            }){
            Text(text ="MyForm")
        }
        Box(modifier = Modifier
            .size(60.dp)
            .fillMaxSize()
            .background(Color.Blue)
            .clickable { navController.navigate(Routes.Pantalla3.route) }
            .constrainAs(continuar) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
            },
            contentAlignment = Alignment.Center)
            {
            Text(text = "Continuar",
                modifier = Modifier,
                fontSize = 25.sp,
                color = Color.White
        )}
    }
}