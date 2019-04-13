package com.gs.hdfc.test;

import com.gs.hdfc.beans.Teacher;
import com.gs.hdfc.service.TeacherService;
import com.gs.hdfc.service.TeacherServiceImpl;

public class School {

	private static TeacherService teacherService = new TeacherServiceImpl();

	public static void main(String[] args) {

		Teacher[] teachers = teacherService.findAll();
		displayTeacherDetails(teachers);
		
		Teacher[] eligibleTeachers = teacherService.findEligibleTeachers();
	}

	private static void displayTeacherDetails(Teacher[] teachers) {

		for (Teacher teacher : teachers) {
			System.out.println(teacher.getId());
			System.out.println(teacher.getAge());
			System.out.println(teacher.getName());
		}

	}

}
