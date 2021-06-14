package comm.atguigu.gulimall.cart.config;


import comm.atguigu.gulimall.cart.interceptor.CartInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class GulimallWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //拦截所有请求
        registry.addInterceptor(new CartInterceptor()).addPathPatterns("/**");
    }
}
