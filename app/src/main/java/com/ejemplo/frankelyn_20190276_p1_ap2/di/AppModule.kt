package com.ejemplo.frankelyn_20190276_p1_ap2.di

import android.content.Context
import androidx.room.Room
import com.ejemplo.frankelyn_20190276_p1_ap2.data.PrestamoDao
import com.ejemplo.frankelyn_20190276_p1_ap2.data.PrestamosDB
import com.ejemplo.frankelyn_20190276_p1_ap2.data.Repositories.PrestamoRepository
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun ProvidesPrestamosDB(@ApplicationContext context: Context): PrestamosDB {
        return Room.databaseBuilder(
            context,
            PrestamosDB::class.java,
            "PrestamosDB"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun ProvidesPrestamoDao(prestamosDB: PrestamosDB): PrestamoDao {
        return prestamosDB.prestamoDao
    }

    @Provides
    fun ProvidesPrestamoRepository(prestamoDao: PrestamoDao): PrestamoRepository{
        return PrestamoRepository(prestamoDao)
    }
}
