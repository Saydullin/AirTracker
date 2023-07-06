package com.example.flighttracker.data.model

data class ClientRequest (
   val ip: String,
   val geo: GeoRequest,
   val connection: ConnectionRequest,
   val device: String?,
   val agent: String?,
   val karma: KarmaRequest,
) {
}