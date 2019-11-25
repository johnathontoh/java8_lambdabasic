package io.javabrains;

public class Person {

	private String Fname;
	private String Lname;
	private int age;
	
	
	
	public Person(String fname, String lname, int age) {
		super();
		Fname = fname;
		Lname = lname;
		this.age = age;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + Fname +", lastName=" + Lname + ", age=" + age + "]";
	}
	
}
