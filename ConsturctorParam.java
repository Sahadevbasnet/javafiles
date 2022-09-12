package basicjava;



public class ConsturctorParam {

	

		private ConsturctorParam (){
			System.out.println("private constructor is called");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ConsturctorParam   q1 = new ConsturctorParam ();
			Pc q2 = new Pc();

			// constructor  is always there
			// constructor with default parameter 
			// constructor with parameter 
			// we can overload the constructor 
			// constructor  are always similar to class name 
			// constructor explicitly does not return anything
			// constructor are used to run code or initialize properties at the time of object creation
		}

	}

	class Pc {
		
		Pc() {
			System.out.println("constructor is private cannot be called outside class");
		}
		
	}