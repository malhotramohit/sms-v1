package com.gs.hdfc.service;

import com.gs.hdfc.beans.Teacher;
import com.gs.hdfc.dao.TeacherDao;
import com.gs.hdfc.dao.TeacherDaoImpl;

public class TeacherServiceImpl  implements TeacherService{
	
	private TeacherDao teacherDaoImpl =  new TeacherDaoImpl();

	@Override
	public Teacher[] findAll() {
		return teacherDaoImpl.findAll();
	}

	@Override
	public Teacher[] findEligibleTeachers() {
		Teacher[] teachers = teacherDaoImpl.findAll();
		for(Teacher teacher : teachers) {
			if(teacher.getAge()>=24) {
				
			}
		}
	}

}
