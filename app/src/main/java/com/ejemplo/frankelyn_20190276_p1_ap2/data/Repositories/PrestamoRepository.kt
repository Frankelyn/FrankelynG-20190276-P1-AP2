package com.ejemplo.frankelyn_20190276_p1_ap2.data.Repositories

import com.ejemplo.frankelyn_20190276_p1_ap2.data.PrestamoDao
import com.ejemplo.frankelyn_20190276_p1_ap2.model.Prestamo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PrestamoRepository @Inject constructor(
    val prestamoDao: PrestamoDao
){
    suspend fun insertar(prestamo: Prestamo){
        prestamoDao.insertar(prestamo)
    }

    fun buscar(id: Int): Flow<List<Prestamo>>{
        return prestamoDao.buscar(id)
    }

    fun GetList(): Flow<List<Prestamo>> {
        return prestamoDao.GetList()
    }


}