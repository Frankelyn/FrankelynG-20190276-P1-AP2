package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.ejemplo.frankelyn_20190276_p1_ap2.model.Prestamo
import com.ejemplo.frankelyn_20190276_p1_ap2.ui.Navigation.ScreensRoutes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue



@Composable
fun RowPrestamos(prestamo: Prestamo) {
    Column() {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(prestamo.deudor)
            Spacer(modifier = Modifier.width(50.dp))
            Text(prestamo.monto.toString())

        }

        Text(prestamo.concepto)
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Composable
fun ConsultaRegistroPrestamosScreen(
    navHostController: NavHostController,
    viewModel: PrestamoViewModel = hiltViewModel()
) {


    var listaPrestamos = viewModel.listaPrestamos.collectAsState(initial= emptyList())

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navHostController.navigate(ScreensRoutes.RegistroPrestamoScreen.ruta)
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

            Text(
                text = "Lista de Prestamos",
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(modifier = Modifier.fillMaxWidth())
            {
                items(listaPrestamos.value){  prestamo ->
                    RowPrestamos(prestamo = prestamo)
                }
            }

        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConsultaColoresScreenPreview() {
    //ConsultaRegistroPrestamosScreen()
}