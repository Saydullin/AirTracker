package com.example.flighttracker.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.flighttracker.data.db.converters.ClientRequestConverter
import com.example.flighttracker.data.db.converters.ConnectionRequestConverter
import com.example.flighttracker.data.db.converters.GeoRequestConverter
import com.example.flighttracker.data.db.converters.KarmaRequestConverter
import com.example.flighttracker.data.db.converters.KeyRequestConverter
import com.example.flighttracker.data.db.dao.FlightDao
import com.example.flighttracker.data.db.entities.airport.AirportEntity
import com.example.flighttracker.data.db.entities.request.ClientRequestEntity
import com.example.flighttracker.data.db.entities.flight.FlightEntity
import com.example.flighttracker.data.db.entities.request.ConnectionRequestEntity
import com.example.flighttracker.data.db.entities.request.GeoRequestEntity
import com.example.flighttracker.data.db.entities.request.KarmaRequestEntity
import com.example.flighttracker.data.db.entities.request.KeyRequestEntity
import com.example.flighttracker.data.db.entities.request.ParamsRequestEntity
import com.example.flighttracker.data.db.entities.request.RequestEntity

@Database(
    entities = [
        AirportEntity::class,
        ClientRequestEntity::class,
        FlightEntity::class,
        ParamsRequestEntity::class,
        RequestEntity::class,
        GeoRequestEntity::class,
        ConnectionRequestEntity::class,
        KarmaRequestEntity::class,
        KeyRequestEntity::class,
    ],
    version = 1,
    exportSchema = true,
)
@TypeConverters(
    GeoRequestConverter::class,
    ConnectionRequestConverter::class,
    ClientRequestConverter::class,
    KarmaRequestConverter::class,
    KeyRequestConverter::class,
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun flightDao(): FlightDao

}