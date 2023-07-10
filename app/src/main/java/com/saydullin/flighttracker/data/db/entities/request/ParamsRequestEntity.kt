package com.saydullin.flighttracker.data.db.entities.request

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ParamsRequestEntity(
    @PrimaryKey val id: Int,
    val lang: String,
)


