package com.imooc.test12;

public class Student {
	private int id;
	private String name;
	private double score;

	public Student() {

	}

	public Student(int id, String name, double score) {
		this.setId(id);
		this.setName(name);
		this.setScore(score);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "[学号：" + this.getId() + "姓名：" + this.getName() + "成绩：" + this.getScore() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) 
			return true;
		if(obj.getClass()==Student.class) {
			Student st=(Student)obj;
			return (st.getId()==id)&&(st.getName().equals(name))&&(st.getScore()==score);
		}else
		return false;
	}

}
