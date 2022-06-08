package com.ejemplo.frankelyn_20190276_p1_ap2.data.Repositories

import com.ejemplo.frankelyn_20190276_p1_ap2.data.PrestamoDao
import com.ejemplo.frankelyn_20190276_p1_ap2.model.Prestamo
import javax.inject.Inject

class PrestamoRepository @Inject constructor(
    val prestamoDao: PrestamoDao
){
    suspend fun insertar(prestamo: Prestamo){
        prestamoDao.insertar(prestamo)
    }

    suspend fun buscar(id: Int){
        prestamoDao.buscar(id)
    }

    suspend fun GetList(){
        prestamoDao.GetList()
    }


}