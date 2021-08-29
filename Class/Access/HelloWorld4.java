package Class.Access;

import Class.Access.Public.Person;

public class HelloWorld4 {
    public static void main(String[] args) {
        Person a = new Person("Chau", 21, 1.7f);
        System.out.println(a.name);
        System.out.println(a.name);
        System.out.println(a.name);
        a.eat("Rice");
    }
}
