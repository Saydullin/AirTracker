package com.saydullin.flighttracker.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.saydullin.flighttracker.data.db.entities.liveFlight.LiveFlightEntity

@Dao
interface FlightDao {

    @Query("SELECT * FROM LiveFlightEntity")
    fun getAll(): List<LiveFlightEntity>

}