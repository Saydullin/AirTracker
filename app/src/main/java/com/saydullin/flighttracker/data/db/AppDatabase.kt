package com.saydullin.flighttracker.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.saydullin.flighttracker.data.db.converters.ClientRequestConverter
import com.saydullin.flighttracker.data.db.converters.ConnectionRequestConverter
import com.saydullin.flighttracker.data.db.converters.GeoRequestConverter
import com.saydullin.flighttracker.data.db.converters.KarmaRequestConverter
import com.saydullin.flighttracker.data.db.converters.KeyRequestConverter
import com.saydullin.flighttracker.data.db.dao.FlightDao
import com.saydullin.flighttracker.data.db.entities.airport.AirportEntity
import com.saydullin.flighttracker.data.db.entities.request.ClientRequestEntity
import com.saydullin.flighttracker.data.db.entities.liveFlight.LiveFlightEntity
import com.saydullin.flighttracker.data.db.entities.request.ConnectionRequestEntity
import com.saydullin.flighttracker.data.db.entities.request.GeoRequestEntity
import com.saydullin.flighttracker.data.db.entities.request.KarmaRequestEntity
import com.saydullin.flighttracker.data.db.entities.request.KeyRequestEntity
import com.saydullin.flighttracker.data.db.entities.request.ParamsRequestEntity
import com.saydullin.flighttracker.data.db.entities.request.RequestEntity

@Database(
    entities = [
        AirportEntity::class,
        ClientRequestEntity::class,
        LiveFlightEntity::class,
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