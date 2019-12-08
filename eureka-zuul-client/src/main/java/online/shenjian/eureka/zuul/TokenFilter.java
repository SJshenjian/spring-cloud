package online.shenjian.eureka.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * Token安全过滤
 *
 * @author Jian Shen
 * @version V1.0.0
 * @date 2019/11/16
 */
@Component
public class TokenFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TokenFilter.class);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 指定为true,才会执行run()方法
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String accessToken = request.getParameter("token");
        if (StringUtils.isBlank(accessToken)) {
            LOGGER.warn("Token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("Token is Empty");
            } catch (IOException e) {
                return null;
            }
        }
        LOGGER.info("OK");
        return null;
    }
}
