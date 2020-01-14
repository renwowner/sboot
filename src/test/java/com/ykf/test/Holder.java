package com.ykf.test;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;

public class Holder<T> extends PropertyPlaceholderAutoConfiguration {
	
	public static void main(String[] args) throws SocketException {
		
//		List<? extends A> k = new ArrayList<>(){new B(),new C()};
//		k.add(new B());
//		List<? extends A> k = Arrays.asList(new B(),new C());
//		List<E implements A> 
//		((A)k.get(1)).value();
		
		List<NetworkInterface> list = new ArrayList<NetworkInterface>();
		Enumeration<NetworkInterface> ifaces = NetworkInterface.getNetworkInterfaces();
		while(ifaces.hasMoreElements()){
			NetworkInterface k = ifaces.nextElement();
					list.add(k);
					
		}
		Collections.sort(list, (x,y)->{

			return x.getDisplayName().compareTo(y.getDisplayName());
		});
		
		list.forEach(x->System.out.println(x.getName()+">>>"+x.getDisplayName()));
		
	}
	
	

}
interface A{
	void value();
}

class B implements A{
	public void value(){
		System.out.println("this is B");
	}
}
class C implements A{
	public void value(){
		System.out.println("this is C");
	}
}
