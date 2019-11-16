package online.shenjian.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/16
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }
}
