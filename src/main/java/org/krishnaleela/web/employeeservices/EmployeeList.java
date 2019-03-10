package org.krishnaleela.web.employeeservices;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeList {
	public EmployeeList() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	private List<Employee> employeeList = null;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
