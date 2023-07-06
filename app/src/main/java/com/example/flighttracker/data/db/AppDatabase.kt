package com.example.flighttracker.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.flighttracker.data.db.entities.FlightResponseEntity

@Database(
    entities = [
        FlightResponseEntity::class,
    ],
    version = 0,
    exportSchema = true,
)
abstract class AppDatabase : RoomDatabase() {



}