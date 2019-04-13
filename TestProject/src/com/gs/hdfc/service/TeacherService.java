package com.gs.hdfc.service;

import com.gs.hdfc.beans.Teacher;

public interface TeacherService {

	public Teacher[] findAll();

	public Teacher[] findEligibleTeachers();
	
}
