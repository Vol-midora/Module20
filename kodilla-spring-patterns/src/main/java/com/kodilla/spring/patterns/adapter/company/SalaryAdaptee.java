package com.kodilla.spring.patterns.adapter.company;


import java.math.BigDecimal;
import java.util.List;

import com.kodilla.spring.patterns.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.spring.patterns.adapter.company.newhrsystem.Employee;
import com.kodilla.spring.patterns.adapter.company.newhrsystem.SalaryProcessor;

public class SalaryAdaptee implements SalaryProcessor {
	
	@Override
	public BigDecimal calculateSalaries(List<Employee> employees) {
		CompanySalaryProcessor processor = new CompanySalaryProcessor();
		return processor.calculateSalaries(employees);
	}

}
