package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	String firstName;
	String secondName;
	int age;
	//Behavior - default constructor
	public Person(){
		this.firstName ="Andrey";
		this.secondName = "Ivanov";
		this.age = 26;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public void announce() {
		System.out.println("I am " + getFirstName() + getSecondName() + "my age is " + getAge());
	}
}

