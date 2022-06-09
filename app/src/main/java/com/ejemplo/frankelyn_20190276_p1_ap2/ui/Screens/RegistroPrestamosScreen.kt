package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamosScreen(
    navHostController: NavHostController,
    viewModel: PrestamoViewModel = hiltViewModel()
) {

    var deudorError by remember { mutableStateOf(false)}
    var conceptoError by remember { mutableStateOf(false)}
    var montoError by remember { mutableStateOf(false)}
    val context = LocalContext.current
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    deudorError= viewModel.txDeudor.isBlank()
                    conceptoError=viewModel.txConcepto.isBlank()
                    montoError=viewModel.txMonto.isBlank()
                    if(!deudorError && !conceptoError && !montoError){
                        if(viewModel.txMonto.toDouble()>0){
                            viewModel.Guardar()
                            navHostController.navigateUp()
                        }else{
                            Toast.makeText(context, "El monto debe ser menor a cero", Toast.LENGTH_LONG).show()
                        }

                    }


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
                onValueChange = { viewModel.txDeudor = it
                                deudorError = false},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null
                    )
                },
                isError = deudorError
            )
            validar(error = deudorError)

            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Concepto")
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = viewModel.txConcepto,
                onValueChange = { viewModel.txConcepto = it
                                conceptoError=false},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = { Icon(imageVector = Icons.Default.Book, contentDescription = null) },
                isError = conceptoError
            )

            validar(error = conceptoError)
            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Monto")
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = viewModel.txMonto,
                onValueChange = { viewModel.txMonto = it
                                montoError=false},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.CurrencyExchange,
                        contentDescription = null
                    )
                },
                isError = montoError
            )
            validar(error = montoError)

        }
    }
}


@Composable
fun validar(error: Boolean){
    val assistiveElementText = if(error) "Error: Obligatorio" else "*obligatorio"
    val assistiveElementColor = if(error) {
        MaterialTheme.colors.error
    }else{
        MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.medium)
    }

   Text(
       text = assistiveElementText,
       color = assistiveElementColor,
       style = MaterialTheme.typography.caption,
       modifier = Modifier.padding(start = 16.dp)
   )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegistroPrestamosScreenPreview() {
    //RegistroPrestamosScreen()

}