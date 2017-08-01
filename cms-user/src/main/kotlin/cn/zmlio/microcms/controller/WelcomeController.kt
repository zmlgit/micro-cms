package cn.zmlio.microcms.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RestController
@RequestMapping(path = arrayOf("", "/"))
class WelcomeController {
    @GetMapping("", produces = arrayOf("text/html"))
    fun index(): String {
        return "Hello World"
    }
}