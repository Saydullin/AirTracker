package com.saydullin.flighttracker.data.db.entities.request

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RequestEntity(
    @PrimaryKey val id: String,
    val lang: String,
    val currency: String,
    val time: String,
    val server: String,
    val host: String,
    val pid: String,
    val key: KeyRequestEntity,
    @Embedded("params_") val params: ParamsRequestEntity,
    val version: Int,
    val method: String,
    val client: ClientRequestEntity,
)


