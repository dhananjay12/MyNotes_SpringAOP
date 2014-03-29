package mynotes.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {	
	
	@Before("execution(public String getName())")
	public void logMessage(){
		System.out.println("Before Logging Aspect from annotation");
	}

}
