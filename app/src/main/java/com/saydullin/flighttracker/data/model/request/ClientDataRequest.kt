package com.saydullin.flighttracker.data.model.request

data class ClientDataRequest (
    val ip: String,
    val geo: GeoDataRequest,
    val connection: ConnectionDataRequest,
    val device: String?,
    val agent: String?,
    val karma: KarmaDataRequest,
) {
}