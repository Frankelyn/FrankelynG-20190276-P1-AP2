package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ejemplo.frankelyn_20190276_p1_ap2.ui.Navigation.ScreensRoutes


@Composable
fun ConsultaRegistroScreen(navHostController: NavHostController) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navHostController.navigate(ScreensRoutes.RegistroScreen.ruta)
                })
            {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(it)
        ) {
            Text(text = "Yo sere la consulta")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConsultaColoresScreenPreview() {
    //ConsultaRegistroScreen()
}