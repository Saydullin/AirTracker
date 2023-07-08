package com.example.flighttracker.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.flighttracker.data.db.entities.flight.FlightEntity

@Dao
interface FlightDao {

    @Query("SELECT * FROM FlightEntity")
    fun getAll(): List<FlightEntity>

}