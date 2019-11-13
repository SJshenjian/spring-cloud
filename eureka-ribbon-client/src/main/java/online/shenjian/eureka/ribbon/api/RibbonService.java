package online.shenjian.eureka.ribbon.api;

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

    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }
}
