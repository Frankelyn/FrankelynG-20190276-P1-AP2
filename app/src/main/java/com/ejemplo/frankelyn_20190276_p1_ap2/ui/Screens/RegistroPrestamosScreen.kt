package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamosScreen(
    //navHostController: NavHostController
) {

    Column() {



        OutlinedButton(

            onClick = {
                //navHostController.navigateUp()
            }
        ) {
            Text(text = "Guardar")
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegistroScreenPreview() {
   RegistroPrestamosScreen()

}