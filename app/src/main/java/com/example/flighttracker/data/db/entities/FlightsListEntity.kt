package com.example.flighttracker.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FlightsListEntity(
    @PrimaryKey val id: Int,
    val flights: List<FlightEntity>
) {
}