package mynotes.aop.service;

import mynotes.aop.model.Managers;
import mynotes.aop.model.SoftwareDevelopers;

public class EmployeeService {
	
	private SoftwareDevelopers softwareDevelopers;
	private Managers managers;
	public SoftwareDevelopers getSoftwareDevelopers() {
		return softwareDevelopers;
	}
	public void setSoftwareDevelopers(SoftwareDevelopers softwareDevelopers) {
		this.softwareDevelopers = softwareDevelopers;
	}
	public Managers getManagers() {
		return managers;
	}
	public void setManagers(Managers managers) {
		this.managers = managers;
	}

}
