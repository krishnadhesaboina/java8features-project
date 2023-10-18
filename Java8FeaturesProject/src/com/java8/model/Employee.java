package com.java8.model;

public class Employee {

	
	private Integer empId;
	private String empName;
	private Integer age;
	private String dept;
	private Integer sal;
	
	

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", dep=" + dept + ", sal=" + sal
				+ "]";
	}
	public Employee(Integer empId, String empName, Integer age, String dep, Integer sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.dept = dep;
		this.sal = sal;
	}
	
	
}
