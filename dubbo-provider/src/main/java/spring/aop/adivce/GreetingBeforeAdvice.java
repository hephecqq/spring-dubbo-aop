package spring.aop.adivce;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * �ʺ�ӿ�ǰ��֪ͨ
 * 
 * @author Administrator
 *
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// ����ķ���淶
		String clientName = (String) args[0];
		System.out.println("clientName:" + clientName);

	}

}
