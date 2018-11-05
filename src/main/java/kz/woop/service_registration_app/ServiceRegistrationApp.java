package kz.woop.service_registration_app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistrationApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistrationApp.class, args);
    }
}
