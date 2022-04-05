package com.example.data.service.remote

import com.example.data.model.remote.response.GetMatchInfoResponse
import com.example.data.model.remote.response.GetRankedInfoResponse
import com.example.data.model.remote.response.GetSummonerInfoResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path


private const val API_KEY= ""

interface RiotApiService {
    @GET("{server}.api.riotgames.com/lol/summoner/v4/summoners/by-name/{user_name}?api_key=$API_KEY")
    suspend fun getSummonerInfo(@Path("server") server: String, @Path("user_name") name: String ): Flow<GetSummonerInfoResponse>

    @GET("{server}.api.riotgames.com/lol/league/v4/entries/by-summoner/{id}?api_key={API_KEY}")
    suspend fun getRankedInfo(@Path("server") server: String, @Path("id") id: String ): Flow<List<GetRankedInfoResponse>>

    @GET("https://{continetal_server}.api.riotgames.com/lol/match/v5/matches/by-puuid/{puui_id}/ids?start=0&count=20&api_key={API_KEY}")
    suspend fun getMaches(@Path("continetal_server") continentalServer: String, @Path("puui_id") puuiId: String ): Flow<List<String>>

    @GET("https://{continetal_server}.api.riotgames.com/lol/match/v5/matches/{match_id}?api_key={API_KEY}")
    suspend fun getMacheInfo(@Path("continetal_server") continentalServer: String, @Path("match_id") matchId: String ): Flow<GetMatchInfoResponse>
}