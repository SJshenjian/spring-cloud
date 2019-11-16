package online.shenjian.eureka.feign.api;

import online.shenjian.eureka.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/16
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromEurekaClient(@RequestParam(value = "name") String name);
}
