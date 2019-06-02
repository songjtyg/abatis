package org.sjt.mybatis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
//    @Bean
//    public PageHelper pageHelper(){
//         PageHelper pageHelper = new PageHelper();
//         Properties properties = new Properties();
//         properties.setProperty("offsetAsPageNum","true");
//         properties.setProperty("rowBoundsWithCount","true");
//         properties.setProperty("reasonable","true");
//         properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
//         pageHelper.setProperties(properties);
//         return pageHelper;
//    }
}
