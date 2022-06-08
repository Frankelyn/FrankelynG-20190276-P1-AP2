package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamosScreen(
    navHostController: NavHostController,
    viewModel: PrestamoViewModel = hiltViewModel()
) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    viewModel.Guardar()
                    navHostController.navigateUp()
                })
            {
                Icon(imageVector = Icons.Default.Save, contentDescription = null)
            }

        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(it)
        ) {

            Text(
                text = "Prestamo",
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Deudor")
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = viewModel.txDeudor,
                onValueChange = { viewModel.txDeudor = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null
                    )
                }
            )

            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Concepto")
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = viewModel.txConcepto,
                onValueChange = { viewModel.txConcepto = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = { Icon(imageVector = Icons.Default.Book, contentDescription = null) }
            )

            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Monto")
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = viewModel.txMonto,
                onValueChange = { viewModel.txMonto = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.CurrencyExchange,
                        contentDescription = null
                    )
                }
            )

        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegistroPrestamosScreenPreview() {
    //RegistroPrestamosScreen()

}