package com.example.module;

import com.example.module.bla.BlaApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ModuleAApplication {

    @Autowired
    BlaApiService blaApiService;

    static void main(String[] args) {
        SpringApplication.run(ModuleAApplication.class, args);
    }

    @GetMapping("do")
    public void doSomething() {

        blaApiService.doSomething();
    }

}
