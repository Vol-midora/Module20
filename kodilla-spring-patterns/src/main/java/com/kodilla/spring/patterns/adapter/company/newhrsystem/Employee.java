package com.kodilla.spring.patterns.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {

	private final String peselId;
	private final String name;
	private final String username;
	private final BigDecimal baseSalary;

	public Employee(String peselId, String name, String username, BigDecimal baseSalary) {
		this.peselId = peselId;
		this.name = name;
		this.username = username;
		this.baseSalary = baseSalary;
	}

	public String getPeselId() {
		return peselId;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public BigDecimal getBaseSalary() {
		return baseSalary;
	}

	@Override
	public int hashCode() {
		return peselId !=null ? peselId.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof Employee)) return false;
		Employee employee = (Employee) obj;
		return peselId!=null ? peselId.equals(employee.getPeselId()) : employee.getPeselId()==null;
		
	}

	@Override
	public String toString() {
		return "Employee [peselId=" + peselId + ", name=" + name + ", username=" + username + ", baseSalary="
				+ baseSalary + "]";
	}
	
	
	
	
	

}
