package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Navigation

sealed class ScreensRoutes (val ruta: String){
    object ConsultaRegistroScreen: ScreensRoutes("ConsultaRegistro")
    object RegistroScreen: ScreensRoutes("Registro")
}