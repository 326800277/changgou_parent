package zjw;

import com.changgou.seckill.config.ResourceServerConfig;
import com.changgou.seckill.config.TokenDecode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.oauth2.provider.token.TokenStore;

import java.lang.reflect.Constructor;

public class conFigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceServerConfig.class);
        TokenStore tokenStore = (TokenStore)context.getBean(TokenStore.class);
        System.out.println(tokenStore.toString());

    }
}
