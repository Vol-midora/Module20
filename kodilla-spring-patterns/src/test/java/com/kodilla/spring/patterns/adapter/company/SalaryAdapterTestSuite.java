package com.kodilla.spring.patterns.adapter.company;

import org.junit.Assert;
import org.junit.Test;

import com.kodilla.spring.patterns.adapter.company.oldhrsystem.*;

public class SalaryAdapterTestSuite {

	@Test
	public void testTotalSalary() {
		//Given
		Workers workers = new Workers();
		SalaryAdapter adapter = new SalaryAdapter();
		
		//When
		double totalSalary = adapter.totalSalary(workers.getWorkers(), workers.getSalaries());
		
		//Then
		System.out.println(totalSalary);
		Assert.assertEquals(totalSalary, 27750, 0);
	}
}
