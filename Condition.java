package basicjava;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("If condtion");

//conditional statement  
// one input --- multiple outcome-----conditional
//numT 0 to 5 ---- discount 5%
//numT 6 to 10 --- discount 10%
//numT 10 above -- discount 30%

int numT=4;
//if (numT>0 && numT<=5) {
//	System.out.println("Discount 5 percent");
//}
//	if(numT>5 && numT<=10){
//		System.out.println("Discount 10 Percent");
//	}		
//	if(numT>10) {
//		System.out.println("Discount 30 Percent");
//	}

if(numT>0 && numT<=5){
	System.out.println("Discount 5 Percent");
}

else if(numT>5 && numT<=10){
	System.out.println("Discount 10 Percent");
}

else if(numT>5 && numT<=10){
	System.out.println("Discount 30 Percent");
}



//
//int marks=69;
//
//if(marks>90) {
//	System.out.println("Grade A");
//}
//
//if(marks>75 && marks<=90) {
//	System.out.println("Grade B");
//}
//
//if(marks>=60 && marks<=75) {
//System.out.println("Grade C");
//
//	}
	

int marks=69;

if(marks>90) {
	System.out.println("Grade A");
}

else if(marks>75 && marks<=90) {
	System.out.println("Grade B");
}

else if(marks>=60 && marks<=75) {
System.out.println("Grade C");

	}
	
	}
	}


