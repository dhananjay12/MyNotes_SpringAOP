package mynotes.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutConfig {
	
	@Pointcut("execution(* mynotes.aop.model.SoftwareDevelopers.getName())") //This is a pointcut expression
    public void dummyMethod() {} //This is a name given to the pointcut expression
	
	//Other Such Pointcuts 

}
