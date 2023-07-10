package com.saydullin.flighttracker.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.saydullin.flighttracker.data.db.entities.airport.AirportEntity

@Dao
interface AirportDao {

    @Query("SELECT * FROM AirportEntity")
    fun getAll(): List<AirportEntity>

}