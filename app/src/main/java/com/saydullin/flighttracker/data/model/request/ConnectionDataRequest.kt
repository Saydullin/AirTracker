package com.saydullin.flighttracker.data.model.request

data class ConnectionDataRequest (
    val type: String,
    val isp_code: Int,
    val isp_name: String,
) {
}