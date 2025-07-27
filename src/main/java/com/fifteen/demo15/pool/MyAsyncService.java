package com.fifteen.demo15.pool;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyAsyncService {

    @Async("thread1")
    public void process(){

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
