package course.linkflower.link.oneframework.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CarAdminApp {
    public static void main(String[] args) {
        SpringApplication.run(CarAdminApp.class, args);
    }
}
