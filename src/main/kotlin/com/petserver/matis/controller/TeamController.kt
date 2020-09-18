package com.petserver.matis.controller

import com.petserver.matis.properties.OddsProperties
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import reactor.core.publisher.Mono


@Controller
class TeamController(private val oddsProperties: OddsProperties) {

    @GetMapping("/{id}")
    private fun getEmployeeById(@PathVariable team: String): Mono<String?> {
        return Mono.just("Hello $team!")
    }
}