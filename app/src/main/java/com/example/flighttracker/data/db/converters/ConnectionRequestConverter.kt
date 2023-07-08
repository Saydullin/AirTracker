package com.example.flighttracker.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.flighttracker.data.db.entities.request.ConnectionRequestEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class ConnectionRequestConverter {

    @TypeConverter
    fun fromConnectionToString(connection: ConnectionRequestEntity?): String? {
        return Gson().toJson(connection)
    }

    @TypeConverter
    fun fromStringToConnection(connectionString: String): ConnectionRequestEntity? {
        val listType = object: TypeToken<ConnectionRequestEntity>(){}.type
        return Gson().fromJson(connectionString, listType)
    }

}