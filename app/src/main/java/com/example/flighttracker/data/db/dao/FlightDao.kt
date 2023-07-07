package com.example.flighttracker.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.flighttracker.data.db.entities.FlightsListEntity

@Dao
interface FlightDao {

    @Query("SELECT * FROM FlightsListEntity")
    fun getAll(): List<FlightsListEntity>

}