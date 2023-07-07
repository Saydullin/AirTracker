package com.example.flighttracker.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.flighttracker.data.db.dao.FlightDao
import com.example.flighttracker.data.db.entities.ClientRequestEntity
import com.example.flighttracker.data.db.entities.FlightEntity
import com.example.flighttracker.data.db.entities.FlightsListEntity
import com.example.flighttracker.data.db.entities.ParamsRequestEntity
import com.example.flighttracker.data.db.entities.RequestEntity

@Database(
    entities = [
        ClientRequestEntity::class,
        FlightEntity::class,
        FlightsListEntity::class,
        ParamsRequestEntity::class,
        RequestEntity::class,
    ],
    version = 1,
    exportSchema = true,
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun flightDao(): FlightDao

}