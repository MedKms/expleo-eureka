package ma.expleo.expleoeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExpleoEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpleoEurekaServiceApplication.class, args);
    }

}
