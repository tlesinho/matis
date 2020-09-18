package com.petserver.matis.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@ConfigurationProperties("odds")
@Component
data class OddsProperties(
        var apiKey: String = ""
)