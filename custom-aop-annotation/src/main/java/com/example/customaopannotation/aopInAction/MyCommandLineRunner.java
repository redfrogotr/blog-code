package com.example.customaopannotation.aopInAction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Resource
    private Sleep sleep;

    @Override
    public void run(String... var1) throws Exception {
        System.out.println("Look here!");
        sleep.serve();
        System.out.println("WATMAN");
    }

}