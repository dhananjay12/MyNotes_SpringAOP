package mynotes.aop.aspect;

import java.util.Date;

import mynotes.aop.model.Managers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {	
	
	@Before("execution(public String getName())")
	public void logMessage(){
		System.out.println("Before Logging Aspect from annotation");
	}
	
	
	@Before("execution(* mynotes.aop.model.Managers.getName())")
	public void logMessage(JoinPoint joinpoint){
		System.out.println("Method : "+joinpoint.getSignature().getName()+"at "+ new Date());
		Managers manager=(Managers) joinpoint.getTarget();
		manager.setName("New Name");
	}

}
