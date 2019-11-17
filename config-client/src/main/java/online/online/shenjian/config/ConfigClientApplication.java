package online.online.shenjian.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/17
 */
@SpringBootApplication
@RefreshScope
@RestController
public class ConfigClientApplication {

    @Value("${author}")
    private String author;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @RequestMapping(value = "/getAuthor")
    public String getAuthor() {
        return author;
    }
}
