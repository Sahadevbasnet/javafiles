package basicjava;


class Person2{
	
	int height;
	int weight;
	int age;
	
	//constructor
	
	Person2( int hgt, int wgt, int age){
		
		this.height = hgt;
		this.weight = wgt;
		this.age = age;
		
	}
	
	
	public static void run() {
		System.out.println(" I am running every morning");
	}

public static void sleep() {
	System.out.println("I would like to sleep in");
}

}




public class oops2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("sushan's info");
		
		Person2 sushan = new Person2(5, 60, 29);
		System.out.println(sushan.age);
		System.out.println(sushan.weight);
		System.out.println(sushan.height);
		
		
		System.out.println("sonu's info");
		
		Person2 sonu = new Person2(5, 45, 23);
		System.out.println(sonu.height);
		System.out.println(sonu.weight);
		System.out.println(sonu.age);
		
		
		sonu.sleep();
		sonu.run();
		
		
		sushan.sleep();
		
	}
}