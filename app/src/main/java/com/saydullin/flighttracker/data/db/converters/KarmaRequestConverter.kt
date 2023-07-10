package com.saydullin.flighttracker.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.saydullin.flighttracker.data.db.entities.request.KarmaRequestEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class KarmaRequestConverter {

    @TypeConverter
    fun fromKarmaToString(karma: KarmaRequestEntity?): String? {
        return Gson().toJson(karma)
    }

    @TypeConverter
    fun fromStringToKarma(karmaString: String): KarmaRequestEntity? {
        val listType = object: TypeToken<KarmaRequestEntity>(){}.type
        return Gson().fromJson(karmaString, listType)
    }

}