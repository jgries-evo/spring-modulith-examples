package com.example.module;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModuleATest {

    @Test
    void moduleVerify() {

        ApplicationModules modules = ApplicationModules.of("com.example.module");
        modules.verify();

    }
}
