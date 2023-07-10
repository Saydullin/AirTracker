package com.saydullin.flighttracker.domain.model.flight

import com.saydullin.flighttracker.domain.model.request.RequestResponse

data class MainFlight(
    val request: RequestResponse,
    val response: List<Flight>,
    val terms: String,
)