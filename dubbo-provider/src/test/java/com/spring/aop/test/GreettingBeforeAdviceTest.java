package com.spring.aop.test;

import java.io.IOException;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import spring.aop.adivce.GreetingBeforeAdvice;
import spring.aop.service.Waiter;
import spring.aop.service.impl.NativeWaiterImpl;

/**
 * �ʺ����ǰ��֪ͨ������
 * 
 * @author Administrator
 *
 */
public class GreettingBeforeAdviceTest {
	
	public static void main(String[] args) throws IOException {
		Waiter target = new NativeWaiterImpl();
		BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
		
		//����������
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.addAdvice(beforeAdvice);
		Waiter proxy = (Waiter) proxyFactory.getProxy();
		proxy.greetTo("123...");
		System.in.read();
	}
	
	
	
}
