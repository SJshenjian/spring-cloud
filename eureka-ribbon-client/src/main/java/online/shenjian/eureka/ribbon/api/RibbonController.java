package online.shenjian.eureka.ribbon.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/10
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String home(@RequestParam(required = false, defaultValue = "shenjian") String name) {
        return ribbonService.hi(name);
    }
}
