package com.saydullin.flighttracker.data.model.route

import com.saydullin.flighttracker.data.model.request.RequestDataResponse

data class MainRouteResponse(
    val request: RequestDataResponse,
    val response: List<RouteResponse>,
    val terms: String,
)