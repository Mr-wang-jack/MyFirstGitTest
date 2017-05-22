package com.whz.base;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 
 * @author  wanghongzhi
 * @CreateTime 2016年8月12日下午4:28:54
 */

@Configurable
@EnableAutoConfiguration 
@ComponentScan
//或者使用@SpringBootApplication == @Configurable+@EnableAutoConfiguration+@ComponentScan
//@ImportResource 导入xml配置文件
//@Import(value=BaseMain.class)
public class BaseMain {
	public static void main(String[] args) throws Exception {
//		SpringApplication.run(BaseMain.class,args);
		SpringApplication app = new SpringApplication(BaseMain.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
