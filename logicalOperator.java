package basicjava;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// &&, OR, NOT
		
	// && Operator
		
		System.out.println("and operator result is boolean");
		
	//true && true ----> true
	//true && false ---> false
	//false && true ---> false
	//false && false --> false	
		
		
	System.out.println(2==2 && 3==3);
	System.out.println(2==2 && 3==4);
	System.out.println(2==3 && 3==3);
	System.out.println(2==3 && 3==4);
	
	
	//OR 
	
	System.out.println("or Operator result is boolean");
	
	//true && true ----> true
	//true && false ---> true
	//false && true ---> true
	//false && false --> false	

	System.out.println(2==2 || 3==3);
	System.out.println(2==2 || 3==4);
	System.out.println(2==3 || 3==3);
	System.out.println(2==3 || 3==4);
	
	
	System.out.println("!= not equal to result is boolean");
	//!= not ture
	// not true ----> false
	// not false ---> true
	
	System.out.println(2!=2);
	System.out.println(2!=3);
	
	
	}

}
