package com.ykf.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@PropertySource(value="classpath:datasource/datas.properties")
@ConfigurationProperties(prefix="kk")
public class TestController1 {

	String ip;
	String name;
	String password;
	
	@RequestMapping("/test1")
	public String fun(){
		System.out.println(ip+name+password);
		return this.ip+":"+this.name+":"+this.password;
	}
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
