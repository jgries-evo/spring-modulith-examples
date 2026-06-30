package com.example.module.blup.internal;

import com.example.module.bla.BlaApiService;
import com.example.module.bla.internal.BlaServiceImpl;
import com.example.module.blup.BlupApiService;
import com.example.module.fu.FuApiService;
import com.example.module.fu.internal.FuApiServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlupApiServiceImpl implements BlupApiService {


    public BlupApiServiceImpl() {

        // module a intern shows issue
        BlaApiService blaService = new BlaServiceImpl(null);

        // module b shows no issue
        FuApiService  fuService = new FuApiServiceImpl();
    }
}


