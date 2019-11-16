package online.shenjian.eureka.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/16
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class EurekaTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTurbineApplication.class, args);
    }
}
