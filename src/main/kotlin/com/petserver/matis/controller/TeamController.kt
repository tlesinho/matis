package com.petserver.matis.controller

import com.petserver.matis.properties.OddsProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class TeamController(private val oddsProperties: OddsProperties) {

    @GetMapping("/team")
    private fun getEmployeeById(@RequestParam team: String): Mono<String> {
        return Mono.just("Hello $team!")
    }
}