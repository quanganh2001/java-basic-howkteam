package Class.Access.Default;

public class Person {
	String name;
	int age;
	float height;
	
	void eat(String foodName) {
		System.out.println(name + " is eating "+ foodName);
	}
	
	int getAge() {
		return age;
	}
}