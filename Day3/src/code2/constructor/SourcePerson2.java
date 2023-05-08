package code2.constructor;

public class SourcePerson2 {
 public static void main(String[] args) {
	
	 Person2 person = new Person2("Kiranya" , 22);
	 
	 String name = person.getName();
	 int age = person.getAge();
	 
	 System.out.println("Name: " + name);
	 System.out.println("Age: " + age);
	 
}
}
