package mynotes.aop.main;

import mynotes.aop.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMainPointCutJoinPoint {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_pointcutJoinpoint.xml");
		EmployeeService employeeService=context.getBean("employeeService",EmployeeService.class);
		
		/*System.out.println(employeeService.getSoftwareDevelopers().getName());
		
		System.out.println(employeeService.getManagers().getName());*/
		
		System.out.println(employeeService.getManagers().getName());
		employeeService.getManagers().setName("Manager2");
		System.out.println(employeeService.getManagers().getName());
	}

}
