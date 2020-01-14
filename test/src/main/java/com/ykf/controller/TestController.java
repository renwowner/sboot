package com.ykf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ykf.facties.App;
import com.ykf.mapper.Test;


@RestController
@Import(Test.class)
@ConfigurationProperties(prefix="datasource")
public class TestController {
    @Autowired
    App app;
    @Autowired
    Test test;
    
	String id;
    
    String name;
    
    String password;

    write write;
    
	@RequestMapping("/test")
		public String fun(){
		System.out.println(app.getName()+app.getId());
		System.out.println(test.getName()+test.getId()+id+name+write.id+write.name+write.password);
		return "hello world:"+id+":"+name+":"+password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public write getWrite() {
		return write;
	}


	public void setWrite(write write) {
		this.write = write;
	}


//	public write getW() {
//		return write;
//	}
//
//
//	public void setWrite(write w) {
//		this.write = w;
//	}
	
	
	
	
}


