package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {
    @GetMapping("demo")
    fun hello(): String = "Hello World!"
}