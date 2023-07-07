package com.example.flighttracker.data.model

data class RequestResponse (
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


