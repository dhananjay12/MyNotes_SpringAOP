package mynotes.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class AroundAdviceAspect {
	
	@Around("args(String)")
	public void logMessage1(ProceedingJoinPoint joinpoint){		
		try {
			System.out.println("@Around Logging Aspect logMessage1() invoked before joinpoint.proceed()");
			joinpoint.proceed();//this is where the joinpoint gets executed
			System.out.println("@Around Logging Aspect logMessage1() invoked after joinpoint.proceed()");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@Around Logging Aspect logMessage1() invoked at the end");
	}
	
	//wrong implementation 
	/*@Around("args(input)")
	public void logMessage2(ProceedingJoinPoint joinpoint,int input){
		try {
			System.out.println("@Around Logging Aspect logMessage2() invoked before joinpoint.proceed()");
			System.out.println("Input=>"+input);
			joinpoint.proceed();//this is where the joinpoint gets executed
			System.out.println("@Around Logging Aspect logMessage2() invoked after joinpoint.proceed()");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@Around Logging Aspect logMessage2() invoked at the end");
		
	}*/
	
	@Around("args(input)")
	public int logMessage2(ProceedingJoinPoint joinpoint,int input){
		int returnValue=0;
		try {
			System.out.println("@Around Logging Aspect logMessage2() invoked before joinpoint.proceed()");
			System.out.println("Input=>"+input);
			returnValue=(int) joinpoint.proceed();//this is where the joinpoint gets executed
			System.out.println("@Around Logging Aspect logMessage2() invoked after joinpoint.proceed()");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@Around Logging Aspect logMessage2() invoked at the end");
		return returnValue;
	}
	
	@Around("args(int,int)")
	public int logMessage3(ProceedingJoinPoint joinpoint){
		int returnValue=0;
		Object[] objectArray=joinpoint.getArgs();
		for (int i = 0; i < objectArray.length; i++) {
			System.out.println("i "+i+"=>"+objectArray[i]);
		}
		try {
			System.out.println("@Around Logging Aspect logMessage3() invoked before joinpoint.proceed()");
			returnValue=(int) joinpoint.proceed();//this is where the joinpoint gets executed
			System.out.println("@Around Logging Aspect logMessage3() invoked after joinpoint.proceed()");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@Around Logging Aspect logMessage3() invoked at the end");
		return returnValue;
	}
	
	
}
