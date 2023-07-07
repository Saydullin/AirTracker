package com.example.flighttracker.data.model.request

data class ConnectionRequest (
    val type: String,
    val isp_code: Int,
    val isp_name: String,
) {
}