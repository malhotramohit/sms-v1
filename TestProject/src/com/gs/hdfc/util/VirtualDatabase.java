package com.gs.hdfc.util;

import com.gs.hdfc.beans.Student;
import com.gs.hdfc.beans.Teacher;

public class VirtualDatabase {

	// teacher dummy table -- 3 teachers array
	// student dummy table -- 3 students array

	public static Teacher[] teachers = new Teacher[3];
	public static Student[] students;

	static {
		Teacher teacher1 = new Teacher(1, "techer 1", 23);
		Teacher teacher2 = new Teacher(2, "techer 2", 24);
		Teacher teacher3 = new Teacher(3, "techer 3", 25);

		teachers[0] = teacher1;
		teachers[1] = teacher2;
		teachers[2] = teacher3;
	}


}
