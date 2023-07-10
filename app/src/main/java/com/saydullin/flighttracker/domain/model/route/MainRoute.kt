package com.saydullin.flighttracker.domain.model.route

import com.saydullin.flighttracker.domain.model.request.RequestResponse

data class MainRoute(
    val request: RequestResponse,
    val response: List<Route>,
    val terms: String,
)