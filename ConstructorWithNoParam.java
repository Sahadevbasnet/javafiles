package basicjava;

public class ConstructorWithNoParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//construction without parameter
		
		substract a = new substract();
		
		Mul c = new Mul(10,50);
		c.multiplication();
	
		Div d = new Div(50, 10);
		d.divison();
		
		Add1 p = new Add1(50, 50);
		p.Addition();
		
		//Overloading the constructor 
		Cal e = new Cal();
		Cal e1 = new Cal(150);
		Cal e2 = new Cal(12,34);	
		e2.Greetings();
				
	}

}

class substract{
	int a =10;
	int b=20;
	
	substract(){
		System.out.println("substraction constructer is calling");
		
		
		
	}
	public void sub() {
		System.out.println(this.a-this.b);
	}
}



//constructor with parameter

class Mul {
	int a1;
	int b1;
	Mul(int a, int b){
				this.a1 =a;
				this.b1= b;
				}
	public void multiplication(){
	
		System.out.println(this.a1 * this.b1);
	}
}
class Div{
	int a2;
	int b2;
	Div(int a, int b){
		this.a2= a;
		this.b2=b;
	}
	public void divison() {
		System.out.println(this.a2 / this.b2);
	}
}
class Add1{
int a3;
int b3;
Add1(int a, int b){
	this.a3 = a;
	this.b3 = b;
}
public void Addition() {
System.out.println( this.a3 + this.b3);
}

}

//Overloading the constructor 

class Cal{

	Cal() {
		System.out.println("constructur is calling wihout no parameter");
	}
		
	Cal(int a){
		System.out.println("constructor is calling with one parameter");
		
	}
	
	Cal(int a , int b){
		System.out.println("Constructor is calling with two called");
	}
	
	
	public void Greetings() {
		System.out.println("Hello everyone");
	}
	}
//Class fields (property and methods)

	// Greet is method
	// Property 
	// Constructor we used to set class properties or execute some code at time of 
	// object creation

