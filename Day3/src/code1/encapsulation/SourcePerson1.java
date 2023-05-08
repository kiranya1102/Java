package code1.encapsulation;

public class SourcePerson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Person1 person = new Person1("Alice" , 30);
String name = person.getName();
int age = person.getAge();

System.out.println("Name: " + name);
System.out.println("Age: " + age);

	}

}
