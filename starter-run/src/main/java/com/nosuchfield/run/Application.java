package com.nosuchfield.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author hourui 2017/10/10 16:48
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    private RunIt runIt;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... strings) throws Exception {
        runIt.hello();
    }
}
