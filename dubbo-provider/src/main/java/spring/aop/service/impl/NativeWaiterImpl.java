package spring.aop.service.impl;

import spring.aop.service.Waiter;

/**
 * ����ӿ�ʵ��
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
