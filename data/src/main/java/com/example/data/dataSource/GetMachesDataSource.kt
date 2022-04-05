package com.example.data.dataSource

import com.example.data.service.RiotApiService

class GetMachesDataSource(private val service: RiotApiService) {
    suspend fun getMaches(server: String, id: String) = service.getMaches(server, id)
}