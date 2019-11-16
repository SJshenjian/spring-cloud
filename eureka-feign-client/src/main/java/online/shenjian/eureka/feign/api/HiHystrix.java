package online.shenjian.eureka.feign.api;

import org.springframework.stereotype.Component;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/16
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromEurekaClient(String name) {
        return "hi," + name + ",sorry, error!";
    }
}
