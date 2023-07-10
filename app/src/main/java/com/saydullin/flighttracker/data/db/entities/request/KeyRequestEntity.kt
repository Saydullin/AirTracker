package com.saydullin.flighttracker.data.db.entities.request

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class KeyRequestEntity(
    @PrimaryKey val id: String,
    val api_key: String,
    val type: String,
    val expired: String,
    val registered: String,
    val limits_by_hour: String,
    val limits_by_minute: String,
    val limits_by_month: String,
    val limits_total: String
)