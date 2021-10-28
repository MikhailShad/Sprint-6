package ru.sber.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import ru.sber.services.FourthService

@Configuration
@ComponentScan("ru.sber.services")
class ServicesConfig {}

@Configuration
class AnotherServicesConfig {

    @Bean
    fun fourthService(): FourthService {
        return FourthService()
    }

}
