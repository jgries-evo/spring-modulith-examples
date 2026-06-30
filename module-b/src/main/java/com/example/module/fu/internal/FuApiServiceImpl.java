package com.example.module.fu.internal;

import com.example.module.fu.FuApiService;
import org.springframework.stereotype.Service;

@Service
public class FuApiServiceImpl implements FuApiService {
    @Override
    public void doSomething() {
        System.err.println("doSomething at fu b");
    }
}
