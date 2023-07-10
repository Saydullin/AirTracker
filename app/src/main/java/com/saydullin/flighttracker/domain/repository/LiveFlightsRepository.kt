package com.saydullin.flighttracker.domain.repository

import androidx.paging.PagingData
import com.saydullin.flighttracker.data.model.liveFlight.LiveFlightResponse
import kotlinx.coroutines.flow.Flow

interface LiveFlightsRepository {

    suspend fun getLiveFlights(): Flow<PagingData<LiveFlightResponse>>

}