package com.saydullin.flighttracker.domain.model.liveFlight

import com.saydullin.flighttracker.data.model.request.ClientDataRequest
import com.saydullin.flighttracker.data.model.request.KeyDataRequest
import com.saydullin.flighttracker.data.model.request.ParamsDataRequest

data class LiveFlightRequest (
    val lang: String,
    val currency: String,
    val time: String,
    val id: String,
    val server: String,
    val host: String,
    val pid: String,
    val key: KeyDataRequest,
    val params: ParamsDataRequest,
    val version: Int,
    val method: String,
    val client: ClientDataRequest,
)


