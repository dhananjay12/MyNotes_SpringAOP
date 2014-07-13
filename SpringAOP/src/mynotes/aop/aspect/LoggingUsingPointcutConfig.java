package mynotes.aop.aspect;

import java.util.Date;

import mynotes.aop.model.Managers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingUsingPointcutConfig {
	
	@Before("PointcutConfig.dummyMethod()")
	public void logMessage1(){
		System.out.println("Before Logging Aspect from PointcutConfig.dummyMethod() in logMessage1()");
	}
	
	@Before("PointcutConfig.dummyMethod()")
	public void logMessage2(){
		System.out.println("Before Logging Aspect from PointcutConfig.dummyMethod() in logMessage2()");
	}
	
	@Before("args(myname)")
	public void logMessage(String myname){
		System.out.println("Before Logging Aspect from args where name="+myname);
	}


}
