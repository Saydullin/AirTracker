package com.saydullin.flighttracker.data.model.request

data class KeyDataRequest(
    val id: String,
    val api_key: String,
    val type: String,
    val expired: String,
    val registered: String,
    val limits_by_hour: String,
    val limits_by_minute: String,
    val limits_by_month: String,
    val limits_total: String
)
