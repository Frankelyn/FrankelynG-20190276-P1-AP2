package com.ejemplo.frankelyn_20190276_p1_ap2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ejemplo.frankelyn_20190276_p1_ap2.ui.Navigation.ScreensRoutes
import com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens.ConsultaRegistroPrestamosScreen
import com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens.RegistroPrestamosScreen

import com.ejemplo.frankelyn_20190276_p1_ap2.ui.theme.Frankelyn20190276P1AP2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Frankelyn20190276P1AP2Theme {
                PrimerParcialFrankelynApp()
            }
        }
    }
}

@Composable
fun PrimerParcialFrankelynApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navHostController = rememberNavController()

        NavHost(
            navController = navHostController,
            startDestination = ScreensRoutes.ConsultaRegistroPrestamoScreen.ruta
        ) {
            composable(ScreensRoutes.ConsultaRegistroPrestamoScreen.ruta) {
                ConsultaRegistroPrestamosScreen(
                    //navHostController = navHostController
                )
            }

            composable(ScreensRoutes.RegistroPrestamoScreen.ruta){
                RegistroPrestamosScreen(
                    //navHostController = navHostController
                )
            }

        }
    }
}