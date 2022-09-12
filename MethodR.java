package basicjava;

public class MethodR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a =10;
	int b=20;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	int s = 100;
	int t = 50;
	System.out.println(s+t);
	System.out.println(s-t);
	System.out.println(s*t);
	System.out.println(s/t);
	System.out.println(s%t);
	
	
	System.out.println("fuction");
	calculator();
	calculator();
	
	System.out.println("fuction without parameter and without return type");
	AddA();
		System.out.println("fuction with parameter and without return type");
	AddB(1000, 2000);
	
	System.out.println("function with parameter and with return type");
	
	int ABC = AddC(150, 150);
System.out.println(ABC);
System.out.println(ABC -100);
System.out.println(ABC*.10);
	}

	public static void calculator(){
		System.out.println(10+5);
		System.out.println(20-18);
	}

public static void AddA() {
	
	System.out.println(100+200);
	
}

public static void AddB(int x, int y) {
System.out.println(x+y);
	
}

public static int AddC( int x, int y) {
	return(x+y);
}

}
