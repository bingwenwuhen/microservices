package cn.com.devh.controllers;

import cn.com.devh.fegin.ServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaxuan on 17/8/26.
 */
@RestController
public class AServiceController {

    @Value("${name:unknown}")
    private String name;

    @Autowired
    private ServiceBClient serviceBClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/")
    public String printServiceA() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===>name:" + name + "<br/>" + serviceBClient.printServiceB();
    }
}
