package com.example.module;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile({"never-be-set"})
public class ModuleBApplication {

    private ModuleBApplication() {
    }
}
