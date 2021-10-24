package ru.sber.services

import org.springframework.stereotype.Service

@Service
class SingletonService {
    override fun toString(): String {
        return "I am singletonService"
    }
}