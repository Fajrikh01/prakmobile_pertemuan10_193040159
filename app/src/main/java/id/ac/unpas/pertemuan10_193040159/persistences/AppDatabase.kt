package id.ac.unpas.pertemuan10_193040159.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.pertemuan10_193040159.model.SetoranSampah

@Database(entities = [SetoranSampah::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranSampahDao(): SetoranSampahDao
}