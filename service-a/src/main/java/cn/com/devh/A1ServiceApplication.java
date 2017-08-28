package cn.com.devh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by xiaxuan on 17/8/25.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class A1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(A1ServiceApplication.class, args);
    }
}
