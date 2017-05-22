package com.whz;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.whz.base.BaseMain;

/**
 * Spring boot Application 入口类
 * @author  wanghongzhi
 * @CreateTime 2016年8月15日下午4:34:53
 */

@Configuration
@EnableAutoConfiguration(exclude={BaseMain.class})//剔除BaseMain配置
@ComponentScan
public class ApplicationEntrance {
	public static void main(String[] args)throws Exception{
		
	}
}
