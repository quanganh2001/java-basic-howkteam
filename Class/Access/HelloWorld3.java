package Class.Access;

import Class.Access.Default.Person;

// Nhưng nếu để class Person ở package mypack thì sẽ báo lỗi

public class HelloWorld3 extends Person {
    protected HelloWorld(String name, int age, float height) {
		//phương thức khởi tạo HelloWorld sẽ gọi phương thức Person
		super(name, age, height);
	}

	public static void main(String[] args) {
		HelloWorld a = new HelloWorld("Chau", 21, 1.7f);
		a.eat("Rice");
	}
}
