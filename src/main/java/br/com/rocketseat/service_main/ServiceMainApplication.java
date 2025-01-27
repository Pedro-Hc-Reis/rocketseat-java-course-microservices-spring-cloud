package br.com.rocketseat.service_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class ServiceMainApplication {

    public static void main ( String[] args ) {
        SpringApplication.run ( ServiceMainApplication.class , args );
    }

}
