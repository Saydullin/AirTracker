package com.example.flighttracker.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.flighttracker.data.model.request.KeyRequest

@Entity
data class RequestEntity(
    @PrimaryKey val id: String,
    val lang: String,
    val currency: String,
    val time: String,
    val server: String,
    val host: String,
    val pid: String,
    val key: KeyRequest,
    val params: ParamsRequestEntity,
    val version: Int,
    val method: String,
    val client: ClientRequestEntity,
)


