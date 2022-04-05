package com.example.data.dataSource

import com.example.data.service.RiotApiService

class GetRankedInfoDataSource(private val service: RiotApiService) {
    suspend fun getRankedInfo(server: String, userName: String) = service.getRankedInfo(server, userName)
}