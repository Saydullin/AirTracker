package com.saydullin.flighttracker.data.repository

import androidx.paging.PagingData
import com.saydullin.flighttracker.data.model.liveFlight.LiveFlightResponse
import com.saydullin.flighttracker.domain.repository.LiveFlightsRepository
import kotlinx.coroutines.flow.Flow

class LiveFlightRepositoryImplLive : LiveFlightsRepository {

    override suspend fun getLiveFlights(): Flow<PagingData<LiveFlightResponse>> {
        TODO("Not yet implemented")
    }

}