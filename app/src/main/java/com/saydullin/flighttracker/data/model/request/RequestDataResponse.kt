package com.saydullin.flighttracker.data.model.request

data class RequestDataResponse (
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


