package spring.aop.adivce;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 问候接口前置通知
 * 
 * @author Administrator
 *
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// 具体的服务规范
		String clientName = (String) args[0];
		System.out.println("clientName:" + clientName);

	}

}
