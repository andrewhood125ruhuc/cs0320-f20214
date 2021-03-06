package com.pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.dev33.satoken.SaManager;

@SpringBootApplication
public class SaTokenJwtDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SaTokenJwtDemoApplication.class, args); 
		System.out.println("\n启动成功：Sa-Token配置如下：" + SaManager.getConfig()); 
	}
	
}