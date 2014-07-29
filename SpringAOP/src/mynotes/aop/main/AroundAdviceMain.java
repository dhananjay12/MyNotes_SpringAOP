package mynotes.aop.main;

import mynotes.aop.model.AroundAdviceModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AroundAdviceMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aroundAdvice.xml");
		AroundAdviceModel aAroundAdviceModel=context.getBean("aroundAdviceModel",AroundAdviceModel.class);
		//aAroundAdviceModel.setSomeString("value1");
		
		//System.out.println("Number returned finally =>"+aAroundAdviceModel.getRandomNumber(100));
		
		System.out.println("Result returned finally =>"+aAroundAdviceModel.multiply(12, 10));
	}

}
