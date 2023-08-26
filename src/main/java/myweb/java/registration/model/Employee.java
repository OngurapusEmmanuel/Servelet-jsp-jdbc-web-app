package myweb.java.registration.model;

public class Employee {
	private int id;
private String name;
private String email;
private String age;
private String phone;
private String password;


public Employee(int id, String name, String email, String age, String phone, String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.phone = phone;
	this.password = password;
}


public Employee(String name, String email, String age, String phone, String password) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.phone = phone;
	this.password = password;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
//public static void registerEmployee(Employee employee) {
//	// TODO Auto-generated method stub
//	
//}


}
