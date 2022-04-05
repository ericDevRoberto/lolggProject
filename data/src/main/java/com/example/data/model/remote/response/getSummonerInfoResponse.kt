package com.example.data.model.remote.response

import java.io.Serializable

data class GetSummonerInfoResponse(
    val id: String,
    val accountId: String,
    val puuid: String,
    val name: String,
    val profileIconId: Int,
    val revisionDate: Int,
    val summonerLevel: Int
): Serializable