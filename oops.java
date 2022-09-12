package basicjava;


public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String
		//Array
		//Boolean
		//Int
		//Object

		Person sushan = new Person();
		// accessing the fields
		System.out.println(sushan.height);
		System.out.println(sushan.weight);
		System.out.println(sushan.age);
		
					
sushan.sleep();
sushan.run();

Person sonu = new Person();

System.out.println(sonu.height);
System.out.println(sonu.weight);
System.out.println(sonu.age);


sonu.sleep();
sonu.run();



	}


	
}


class Person {
	
	
 // property and methods 
 // fields and method

// fields

	int height = 5;
	int weight = 40;
	int age = 25;
		
	// methods 
	 
	 public static void sleep() {
		 System.out.println("Hello I am sleeping");
	 }
	 
	 public static void run() {
		 System.out.println("I am running");
	 }
		

}