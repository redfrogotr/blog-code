package com.example.customaopannotation.aopInAction;

import org.springframework.stereotype.Component;

@Component
public class Sleep {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }
}
