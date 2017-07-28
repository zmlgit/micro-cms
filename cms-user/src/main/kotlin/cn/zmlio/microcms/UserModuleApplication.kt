package cn.zmlio.microcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication class UserModuleApplication : SpringBootServletInitializer()

fun main(args: Array<String>) {
    SpringApplication.run(UserModuleApplication::class.java, *args);
}