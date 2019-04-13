package com.gs.hdfc.beans;

public class Standard {

	private int num;
	private String name;
	private Student[] students;
	private Teacher[] teachers;

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the students
	 */
	public Student[] getStudents() {
		return students;
	}

	/**
	 * @return the teachers
	 */
	public Teacher[] getTeachers() {
		return teachers;
	}

	/**
	 * @param num
	 *            the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(Student[] students) {
		this.students = students;
	}

	/**
	 * @param teachers
	 *            the teachers to set
	 */
	public void setTeachers(Teacher[] teachers) {
		this.teachers = teachers;
	}

	public Standard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard(int num, String name, Student[] students, Teacher[] teachers) {
		this.num = num;
		this.name = name;
		this.students = students;
		this.teachers = teachers;
	}

}
