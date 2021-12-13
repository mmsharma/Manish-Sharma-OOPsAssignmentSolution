package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

public class Main {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		displayDepartmentInfo(adminDepartment);
		System.out.println();

		HrDepartment hrDepartment = new HrDepartment();
		displayDepartmentInfo(hrDepartment);
		System.out.println();

		TechDepartment techDepartment = new TechDepartment();
		displayDepartmentInfo(techDepartment);
	}

	public static void displayDepartmentInfo(SuperDepartment department) {

		System.out.println("Welcome to " + department.departmentName());
		if (department instanceof HrDepartment) {
			HrDepartment hrDepartment = (HrDepartment) department;
			System.out.println(hrDepartment.doActivity());
		}
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		if (department instanceof TechDepartment) {
			TechDepartment techDepartment = (TechDepartment) department;
			System.out.println(techDepartment.getTechStackInformation());
		}
		System.out.println(department.isTodayAHoliday());
	}
}
