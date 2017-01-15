package spring.aop.service;

/**
 * 服务接口
 * 
 * @author Administrator
 *
 */
public interface Waiter {

	/**
	 * 问候接口
	 * 
	 * @param name
	 */
	void greetTo(String name);

	/**
	 * 服务接口
	 * 
	 * @param name
	 */
	void serverTo(String name);
}
