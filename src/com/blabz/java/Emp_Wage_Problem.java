package com.blabz.java;

import java.util.*;

public class Emp_Wage_Problem {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		int randomNum = random.nextInt(2);

		if (randomNum == 1)
			System.out.println("Employee  is Present");
		else
			System.out.println("Employee  is Absent");

	}


}
