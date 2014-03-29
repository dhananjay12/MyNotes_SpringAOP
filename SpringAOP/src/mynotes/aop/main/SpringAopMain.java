package mynotes.aop.main;

import mynotes.aop.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService=context.getBean("employeeService",EmployeeService.class);
		
		System.out.println(employeeService.getSoftwareDevelopers().getName());
		
		System.out.println(employeeService.getManagers().getName());
	}

}
