package Class.Access.Protected;

public class Person {
    protected String name;
	protected int age;
	protected float height;
	
	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	protected void eat(String foodName) {
		System.out.println(name + " is eating "+ foodName);
	}
	
	protected int getAge() {
		return age;
	}
}
