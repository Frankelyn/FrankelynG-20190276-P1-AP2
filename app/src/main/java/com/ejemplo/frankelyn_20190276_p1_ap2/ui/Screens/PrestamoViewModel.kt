package com.ejemplo.frankelyn_20190276_p1_ap2.ui.Screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ejemplo.frankelyn_20190276_p1_ap2.data.Repositories.PrestamoRepository
import com.ejemplo.frankelyn_20190276_p1_ap2.model.Prestamo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PrestamoViewModel @Inject constructor(
    val prestamoRepository: PrestamoRepository
): ViewModel() {
    var txDeudor by mutableStateOf("")

    var txConcepto by mutableStateOf("")

    var txMonto by mutableStateOf("")

    var listaPrestamos = prestamoRepository.GetList()
    private set

    fun Guardar(){
        viewModelScope.launch {
            prestamoRepository.insertar(
                prestamo = Prestamo(
                    deudor = txDeudor,
                    concepto = txConcepto,
                    monto = txMonto.toDouble()
                )
            )
        }
    }

}