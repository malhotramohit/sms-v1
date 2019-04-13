package com.gs.hdfc.dao;

import com.gs.hdfc.beans.Teacher;
import com.gs.hdfc.util.VirtualDatabase;

public class TeacherDaoImpl implements TeacherDao {

	@Override
	public Teacher[] findAll() {
		return VirtualDatabase.teachers;
	}

}
