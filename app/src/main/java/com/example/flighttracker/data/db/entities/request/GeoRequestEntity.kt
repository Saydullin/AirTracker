package com.example.flighttracker.data.db.entities.request

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GeoRequestEntity(
    @PrimaryKey val id: Int,
    val country_code: String,
    val country: String,
    val continent: String,
    val city: String,
    val lat: String,
    val lng: String,
    val timezone: String,
)


