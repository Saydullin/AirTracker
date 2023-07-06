package com.example.flighttracker.domain.model.flight

import com.example.flighttracker.data.model.ClientRequest
import com.example.flighttracker.data.model.KeyRequest
import com.example.flighttracker.data.model.ParamsRequest

data class FlightRequest (
    val lang: String,
    val currency: String,
    val time: String,
    val id: String,
    val server: String,
    val host: String,
    val pid: String,
    val key: KeyRequest,
    val params: ParamsRequest,
    val version: Int,
    val method: String,
    val client: ClientRequest,
)


