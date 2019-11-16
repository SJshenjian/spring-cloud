package online.shenjian.eureka.feign.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/16
 */
@Service
public class FeignService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String hi(String name) {
       return eurekaClientFeign.sayHiFromEurekaClient(name);
    }
}
