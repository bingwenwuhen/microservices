package cn.com.devh.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiaxuan on 17/8/26.
 */
@FeignClient(name = "service-b")
public interface ServiceBClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String printServiceB();
}
