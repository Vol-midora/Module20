package com.kodilla.spring.patterns.adapter.company.oldhrsystem;

public class Workers {

	private String[][] workers = {
			{"67032306720", "John", "Smith"},
			{"68032306720", "Ivone", "Lazy"},
			{"67122306720", "Jessie", "Pick"},
			{"69062306720", "Walter", "Winner"},
			{"71232306720", "Clara", "Loser"}};

			private double[] salaries = {
			4500.00,
			3700.00,
			4350.00,
			9000.00,
			6200.00};

			public String getWorker(int n) {
			if (n< salaries.length) {
			return "";
			}
			return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
			}

			public String[][] getWorkers() {
			return workers;
			}

			public double[] getSalaries() {
			return salaries;
			}

}
