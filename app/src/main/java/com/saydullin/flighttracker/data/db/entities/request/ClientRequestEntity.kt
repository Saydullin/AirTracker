package com.saydullin.flighttracker.data.db.entities.request

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ClientRequestEntity(
    @PrimaryKey val id: Int,
    val ip: String,
    val geo: GeoRequestEntity,
    val connection: ConnectionRequestEntity,
    val device: String?,
    val agent: String?,
    val karma: KarmaRequestEntity,
)


