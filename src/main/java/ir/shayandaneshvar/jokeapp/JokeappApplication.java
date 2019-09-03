package ir.shayandaneshvar.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
        System.out.println("++++++++++++++++++++++++++ ||| Locked & Loaded " +
                "||| ++++++++++++++++++++++++++");
        System.out.println("                           Default: " +
                "localhost:8080");
        System.out.println("-------------------------- ||||||||||||||||||||" +
                "||| --------------------------");
    }

}
