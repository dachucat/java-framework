package course.linkflower.link.oneframework.common.config;

import course.linkflower.link.oneframework.common.feign.UserService;
import course.linkflower.link.oneframework.common.resolver.ClientArgumentResolver;
import course.linkflower.link.oneframework.common.resolver.TokenArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 默认SpringMVC拦截器
 *
 * @author xxx
 * @date 2019/8/5
 * <p>
 * Blog: https://e2cef2000.gitee.io
 * Github: https://github.com/e2cef2000
 */
public class DefaultWebMvcConfig implements WebMvcConfigurer {
	@Lazy
	@Autowired
	private UserService userService;

	/**
	 * Token参数解析
	 *
	 * @param argumentResolvers 解析类
	 */
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		//注入用户信息
		argumentResolvers.add(new TokenArgumentResolver(userService));
		//注入应用信息
		argumentResolvers.add(new ClientArgumentResolver());
	}
}
