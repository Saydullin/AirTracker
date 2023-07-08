package com.example.flighttracker.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.flighttracker.data.db.entities.request.KeyRequestEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class KeyRequestConverter {

    @TypeConverter
    fun fromKeyToString(key: KeyRequestEntity?): String? {
        return Gson().toJson(key)
    }

    @TypeConverter
    fun fromStringToKey(key: String): KeyRequestEntity? {
        val listType = object: TypeToken<KeyRequestEntity>(){}.type
        return Gson().fromJson(key, listType)
    }

}