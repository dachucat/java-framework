package course.linkflower.link.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MembersApp {
    public static void main(String[] args) {
        SpringApplication.run(MembersApp.class, args);
    }
}
