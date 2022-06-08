package com.ejemplo.frankelyn_20190276_p1_ap2.data

import androidx.room.Database
import com.ejemplo.frankelyn_20190276_p1_ap2.model.Prestamo

@Database(
    entities = [Prestamo::class],
    exportSchema = false,
    version = 1
)
abstract class PrestamosDB {
    abstract val prestamoDao: PrestamoDao
}