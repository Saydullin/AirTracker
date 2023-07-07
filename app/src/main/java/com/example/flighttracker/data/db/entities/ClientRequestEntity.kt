package com.example.flighttracker.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.flighttracker.data.model.request.ConnectionRequest
import com.example.flighttracker.data.model.request.GeoRequest
import com.example.flighttracker.data.model.request.KarmaRequest

@Entity
data class ClientRequestEntity(
    @PrimaryKey val id: Int,
    val ip: String,
    val geo: GeoRequest,
    val connection: ConnectionRequest,
    val device: String?,
    val agent: String?,
    val karma: KarmaRequest,
)


