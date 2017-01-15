package com.spring.aop.test;

import java.io.IOException;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import spring.aop.adivce.GreetingBeforeAdvice;
import spring.aop.service.Waiter;
import spring.aop.service.impl.NativeWaiterImpl;

/**
 * 问候服务前置通知测试类
 * 
 * @author Administrator
 *
 */
public class GreettingBeforeAdviceTest {
	
	public static void main(String[] args) throws IOException {
		Waiter target = new NativeWaiterImpl();
		BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
		
		//创建代理工厂
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.addAdvice(beforeAdvice);
		Waiter proxy = (Waiter) proxyFactory.getProxy();
		proxy.greetTo("123...");
		System.in.read();
	}
	
	
	
}
