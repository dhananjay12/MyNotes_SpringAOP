package mynotes.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class AfterAdviceAspect {
	
	@After("args(String)")
	public void logMessage1(){
		System.out.println("@After Logging Aspect logMessage1() invoked");
	}
	
	@AfterReturning(pointcut="args(input)",returning="myReturn")
	public void logMessage2(int input,int myReturn){
		System.out.println("@AfterReturning Logging Aspect logMessage2() invoked");
		System.out.println("Input=>"+input);
		System.out.println("Return=>"+myReturn);
	}
	
	@AfterThrowing(pointcut="args(input)",throwing="ex")
	public void logMessage3(int input,Exception ex){
		System.out.println("@AfterThrowing Logging Aspect logMessage3() invoked");
		System.out.println("Input=>"+input);
		System.out.println("Exception Thrown=>"+ex.getMessage());
	}
	
	@After("args(int)")
	public void logMessage4(){
		System.out.println("@After Logging Aspect logMessage4() invoked");
	}
	

}
