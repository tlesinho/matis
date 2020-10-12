package com.petserver.matis.controller

import com.petserver.matis.properties.OddsProperties
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class TeamController(private val oddsProperties: OddsProperties) {

    @GetMapping("/team")
    private fun getEmployeeById(@RequestParam team: String): Flow<String> {
        return flowOf("Hello $team!")
    }
}