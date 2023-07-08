package com.example.flighttracker.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.flighttracker.data.db.entities.request.ClientRequestEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class ClientRequestConverter {

    @TypeConverter
    fun fromClientToString(client: ClientRequestEntity?): String? {
        return Gson().toJson(client)
    }

    @TypeConverter
    fun fromStringToClient(client: String): ClientRequestEntity? {
        val listType = object: TypeToken<ClientRequestEntity>(){}.type
        return Gson().fromJson(client, listType)
    }

}