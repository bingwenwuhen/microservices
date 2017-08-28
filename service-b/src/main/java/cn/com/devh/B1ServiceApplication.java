package cn.com.devh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by xiaxuan on 17/8/26.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class B1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(B1ServiceApplication.class, args);
    }
}
