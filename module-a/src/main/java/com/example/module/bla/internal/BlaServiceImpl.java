package com.example.module.bla.internal;

import com.example.module.fu.FuApiService;
import com.example.module.bla.BlaApiService;
import org.springframework.stereotype.Service;

@Service
public class BlaServiceImpl implements BlaApiService {

    private final FuApiService fuApiService;

    public BlaServiceImpl(FuApiService fuApiService) {
        this.fuApiService = fuApiService;
    }

    @Override
    public void doSomething() {
        fuApiService.doSomething();
        System.err.println("doSomething at bla");
    }
}
