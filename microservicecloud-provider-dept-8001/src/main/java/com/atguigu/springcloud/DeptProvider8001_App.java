package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //鏈湇鍔″惎鍔ㄥ悗浼氳嚜鍔ㄦ敞鍐岃繘eureka鏈嶅姟涓�
@EnableDiscoveryClient //鏈嶅姟鍙戠幇
public class DeptProvider8001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
