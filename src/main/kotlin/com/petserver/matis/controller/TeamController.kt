package com.petserver.matis.controller

import com.petserver.matis.properties.OddsProperties
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.springframework.http.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.net.URI



@RestController
class TeamController(private val oddsProperties: OddsProperties,
                     private val restTemplate: RestTemplate) {
    @GetMapping("/team")
    private fun getEmployeeById(@RequestParam team: String): Flow<String> {
        return flowOf("Hello $team!")
    }

    @GetMapping("/quote")
    private fun getQuote(@RequestParam ccy: String): Any? {

        val responseEntity = restTemplate.exchange(URI.create("https://api.coingecko.com/api/v3/exchange_rates"), HttpMethod.GET, null, Map::class.java)

        return (responseEntity.body?.get("rates") as Map<String, Any>)[ccy]
    }

    @GetMapping("/match")
    private fun getMatch(): Any? {


        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON
        //headers["X-Auth-Token"] = "361f59a65b3443c19918534628accf76"
        headers.set("X-Auth-Token", "361f59a65b3443c19918534628accf76")

        val entity = HttpEntity<String>(headers)

        val response = restTemplate.exchange(URI.create("http://api.football-data.org/v2/competitions/PL/standings"), HttpMethod.GET, entity, Map::class.java)
        return (response.body)
    }
}


