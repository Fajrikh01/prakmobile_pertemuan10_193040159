package id.ac.unpas.pertemuan10_193040159.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SetoranSampah(
    @PrimaryKey val id: String,
    val tanggal: String,
    val nama: String,
    val berat: String
)
