package com.saydullin.flighttracker.data.model.liveFlight

import com.saydullin.flighttracker.domain.model.request.RequestResponse

data class MainLiveFlightResponse (
    val request: RequestResponse,
    val response: List<LiveFlightResponse>,
    val terms: String,
)