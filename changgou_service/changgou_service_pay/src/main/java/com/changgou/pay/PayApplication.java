package com.changgou.pay;

import com.github.wxpay.sdk.MyConfig;
import com.github.wxpay.sdk.WXPay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
@EnableEurekaClient
public class PayApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(PayApplication.class,args);
    }

    @Bean
    public WXPay wxPay(){
        try {
            return new WXPay(new MyConfig());
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
}
