package com.saydullin.flighttracker.domain.model.liveFlight

import com.saydullin.flighttracker.domain.model.request.RequestResponse

data class MainLiveFlight(
    val request: RequestResponse,
    val response: List<LiveFlight>,
    val terms: String,
)


