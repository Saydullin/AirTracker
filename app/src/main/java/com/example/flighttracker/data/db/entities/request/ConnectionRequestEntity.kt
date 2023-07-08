package com.example.flighttracker.data.db.entities.request

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ConnectionRequestEntity(
    @PrimaryKey val id: Int,
    val type: String,
    val isp_code: Int,
    val isp_name: String,
)