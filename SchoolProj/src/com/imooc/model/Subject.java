package com.imooc.model;

/**
 * 专业类
 * 
 * @author ansmacbookpro
 *
 */
public class Subject {
	// 成员属性：学科名称，学科编号，学制年限、报名选修的学生信息、保存报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;

	// 无参构造函数
	public Subject() {

	}

	// 带参构造函数，实现对学科名称、编号、学制年限全部赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName); // 尽量使用方法赋值
		this.setSubjectNo(subjectNo); // 也可以直接赋值this.subjectName=subjectName;
		this.setSubjectLife(subjectLife);
	}

	// 带参构造函数，实现对全部属性赋值
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName); // 尽量使用方法赋值
		this.setSubjectNo(subjectNo); // 也可以直接赋值this.subjectName=subjectName;
		this.setSubjectLife(subjectLife);
		this.setMyStudent(myStudents);
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getSubjectNo() {
		return this.subjectNo;
	}

	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}

	public int getSubjectLife() {
		return this.subjectLife;
	}

	/**
	 * 获取选修专业的学生信息，如果保存学生信息的数组未被初始化，则，先初始化长度200
	 * 
	 * @return
	 */
	public Student[] getMyStudent() {
		if (this.myStudents == null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}

	public void setMyStudent(Student[] myStudent) {
		this.myStudents = myStudent;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public void addSubject(Student stu) {
		/*
		 * 1、将学生保存到数组中
		 * 2、将学生个数保存到studentNum
		 * */
		int i=0;
		//1、将学生保存到数组中
		for(i=0;i<this.getMyStudent().length;i++) {
			if(this.getMyStudent()[i]==null) {
				this.getMyStudent()[i]=stu;
				break;
			}
		}
		//2、将学生个数保存到studentNum
		this.studentNum=i+1;
	}
	/**
	 * 专业介绍的方法
	 * 
	 * @return专业介绍的相关的信息，包括名称、编号、年限
	 */
	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n学制："
				+ this.getSubjectLife() + "年";
		return str;
	}
}
