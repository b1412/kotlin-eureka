package com.github.b1412.eureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
open class EurekaApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaApplication::class.java, *args)
}
