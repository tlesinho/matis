package com.petserver.matis.domain

import kotlin.time.toDuration

data class Standings(
        val competition: Competition,
        val filters: Map<String, String>,
        val season: Season,
        val standings: List<Standing>) {

    data class Competition(
            val area: Area,
            val code: String,
            val id: Int,
            val lastUpdated: String,
            val name: String,
            val plan: String
    )

    data class Season(
            val currentMatchday: Int,
            val endDate: String,
            val id: Int,
            val startDate: String,
            val winner: Any?
    )

    data class Standing(
            val group: String?,
            val stage: String,
            val table: List<Table>,
            val type: String
    )

    data class Table(
            val draw: Int,
            val form: String?,
            val goalDifference: Int,
            val goalsAgainst: Int,
            val goalsFor: Int,
            val lost: Int,
            val playedGames: Int,
            val points: Int,
            val position: Int,
            val team: Team,
            val won: Int,
            val goalsPerGame: Double = goalsFor.toDouble() / playedGames.toDouble()
    )

    data class Team(
            val crestUrl: String,
            val id: Int,
            val name: String
    )

    data class Area(
            val id: Int,
            val name: String
    )
}