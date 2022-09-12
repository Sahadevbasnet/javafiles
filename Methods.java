package basicjava;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	calc(10,5);
	
	System.out.println("function without parameter and without return type");
	addA();
	System.out.println("function with parameter and without return type");
	addB(100,200);
	System.out.println("fuction with parameter and with return type");
	int a1 = addC(150, 150);
	System.out.println(a1);
	System.out.println(a1+200);
	System.out.println(a1*.10);
	}
public static void calc(int x, int y) {
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
}
	
public static void addA() {
	System.out.println(10+20);
}
public static void addB(int x, int y) {
	System.out.println(x+y);
}

public static int addC(int x, int y) {
	return x+y;
}
}
