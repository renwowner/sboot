package com.ykf.mapper;

import java.io.IOException;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

public class Test {
	String id;
	String name;
	static int m = 0;
	int mm = 1;
	public static void main1(String[] args) {
		
		try {
			Enumeration<URL> urls = Test.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
			

			while(urls.hasMoreElements()){
				String url = urls.nextElement().toString();
				System.out.println(url);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("laldfasdfa");
		}
		
	}
	public Test(){
		this.id = "888";
		this.name = "nana";
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
	@org.junit.Test
	@face()
	@face("asd")
	@face("ddd")
	public void fun(){
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.forEach(k->{System.out.println(k);});
		String[] kk = {"a","b"};
		Arrays.stream(kk).forEach(x->System.out.println(x));
        int b = 0;
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println(b);
				return 0;
			}
		});

	}
	

}

class Com{
	public int compare(int a, int b){
		if(a>b){
			return 1;
		}
		else if (a == b) {
			return 0;
		}
		return -1;
	}
}

interface bb{
	public String fun(String c);
}

@interface faces{
	face[] value();
}

@Repeatable(faces.class)
@interface face{
	String value()default "";

}

