package com.ejemplo.frankelyn_20190276_p1_ap2.data

import androidx.room.*
import com.ejemplo.frankelyn_20190276_p1_ap2.model.Prestamo
import kotlinx.coroutines.flow.Flow

@Dao
interface PrestamoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE )
    suspend fun insertar(prestamo: Prestamo)

    @Delete
    suspend fun eliminar(prestamo: Prestamo)

    @Query("SELECT * FROM Prestamos WHERE prestamoId =:prestamoId")
    fun buscar(prestamoId: Int): Flow<List<Prestamo>>

    @Query("SELECT * FROM Prestamos ORDER BY prestamoId")
    fun GetList(): Flow<List<Prestamo>>
}