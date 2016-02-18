package com.ericsson.SUploader.backend.hello;

import java.io.IOException;
import com.ericsson.SUploader.api.hello.HelloService;
import com.ericsson.SUploader.api.hello.StatusInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hzt
 */

public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
    	System.out.println("service get:" + name);
        return "hello " + name;
    }
    
    //implement a method for dubbo consumer
    //you can implement a socket client which send data to other platform
    public String saveStatusInfo(StatusInfo statusInfo) {
    	System.out.println("service get:" + statusInfo.getVIN());
        return "hello " + statusInfo.getVIN();
    }
    
	public static void main(String[] args) throws IOException {
		com.alibaba.dubbo.container.Main.main(args);   
		
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String("META-INF/spring/dubbo-provider.xml"));
		context.start(); 
		System.out.println("---dubbo service start----");
		System.in.read();*/
	}
}
