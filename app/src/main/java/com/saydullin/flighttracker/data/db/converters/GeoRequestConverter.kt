package com.saydullin.flighttracker.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.saydullin.flighttracker.data.db.entities.request.GeoRequestEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class GeoRequestConverter {

    @TypeConverter
    fun fromGeoToString(geo: GeoRequestEntity?): String? {
        return Gson().toJson(geo)
    }

    @TypeConverter
    fun fromStringToGeo(geoString: String): GeoRequestEntity? {
        val listType = object: TypeToken<GeoRequestEntity>(){}.type
        return Gson().fromJson(geoString, listType)
    }
}