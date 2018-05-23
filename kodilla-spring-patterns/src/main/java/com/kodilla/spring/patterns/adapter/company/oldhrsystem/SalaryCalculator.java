package com.kodilla.spring.patterns.adapter.company.oldhrsystem;

public interface SalaryCalculator {
	double totalSalary(String[][] workers, double[] salaries);
}
