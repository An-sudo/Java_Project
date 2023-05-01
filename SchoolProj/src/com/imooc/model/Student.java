package com.imooc.model;

public class Student {
	// 成员特征：学号，姓名，性别，年龄、专业
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;//
	// 无参构造构造方法

	public Student() {

	}

	// 多参构造方法，实现对学号、姓名、性别、年龄的赋值
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);

	}

	// 多参构造方法，实现对全部属性的赋值
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);

	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentSex(String studentSex) {
		if (studentSex.equals("女")) {
			this.studentSex = studentSex;
		} else {
			this.studentSex = "男";
		}
	}

	public String getStudentSex() {
		return this.studentSex;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge < 18 | studentAge > 100) {
			this.studentAge = 18;
			return;
		}
		this.studentAge = studentAge;
	}

	public int getStudentAge() {
		return this.studentAge;
	}

	/**
	 * 获取专业对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 专业对象信息
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @return 自我介绍的信息，包括姓名、学号、性别、年龄
	 */
	public String introdeuction() {
		String str = "学生信息如下：\n" + "姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称："
				+ this.getStudentSubject().getSubjectName() + "\n学制年限" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @param subjectName
	 * @param subjectLife
	 * @return 自我介绍的信息，包括姓名、学号、年龄、所学专业名称、学制年限
	 */
	public String introdeuction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n" + "姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称：" + subjectName + "\n学制年限"
				+ subjectLife;
		return str;
	}
			
	/**
	 * 学生自我介绍的方法
	 * 
	 * @param mySubject
	 * @return自我介绍的信息，包括姓名、学号、年龄、所学专业名称、学制年限，学号
	 */
	public String introdeuction(Subject mySubject) {
		String str = "学生信息如下：\n" + "姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称：" + mySubject.getSubjectName()
				+ "\n学制年限" + mySubject.getSubjectLife() + "\n专业编号：" + mySubject.getSubjectNo();
		return str;
	}
}
