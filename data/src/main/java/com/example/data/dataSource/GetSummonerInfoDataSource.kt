package com.example.data.dataSource

import com.example.data.service.RiotApiService

class GetSummonerInfoDataSource(private val service: RiotApiService) {
    suspend fun getSummonerInfo(server: String, name: String) = service.getSummonerInfo(server, name)
}