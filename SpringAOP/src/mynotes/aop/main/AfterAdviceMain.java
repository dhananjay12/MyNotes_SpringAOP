package mynotes.aop.main;

import mynotes.aop.model.AfterAdviceModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfterAdviceMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_afterAdvice.xml");
		AfterAdviceModel aAfterAdviceModel=context.getBean("afterAdviceModel",AfterAdviceModel.class);
		//aAfterAdviceModel.setSomeString("value2");
		
		aAfterAdviceModel.getRandomNumber(100);
		
		//aAfterAdviceModel.getRandomNumber(-100);
	}

}
