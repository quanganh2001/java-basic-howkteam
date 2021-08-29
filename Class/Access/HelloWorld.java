package Class.Access;

import Class.Access.Private.Person;

public class HelloWorld {
    public static void main(String[] args) {
        Person a = new Person("Chau", 21, 1.7f);

        a.eat("Rice");
        int age = a.getAge();
        System.out.println("His age: "+age);
    }
}
