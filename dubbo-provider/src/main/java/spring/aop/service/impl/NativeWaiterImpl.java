package spring.aop.service.impl;

import spring.aop.service.Waiter;

/**
 * 服务接口实现
 * 
 * @author Administrator
 *
 */
public class NativeWaiterImpl implements Waiter {

	public void greetTo(String name) {
		System.out.println("greetTo:" + name);
	}

	public void serverTo(String name) {
		System.out.println("serverTo:" + name);
	}

}
