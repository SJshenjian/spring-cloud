package online.shenjian.eureka.ribbon.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/12
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry, error!";
    }
}
