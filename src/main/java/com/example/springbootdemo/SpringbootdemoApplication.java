package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 编译war包到阿里云服务器：
 * 1，需要继承SpringBootServletInitializer
 * 2，将pom文件注解的关于tomcat的配置注释打开
 */
@SpringBootApplication
public class SpringbootdemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootdemoApplication.class);
	}
}
