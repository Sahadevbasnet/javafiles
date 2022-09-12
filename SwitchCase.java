package basicjava;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Switch Case (without) break

System.out.println("switch case without break");
		
String county="wake";

switch(county) {

case "wake":
System.out.println("Morrisville");

case "durham":
	System.out.println("Roxboro");

case "orange":
	System.out.println("Chapelhill");

	default:
		System.out.println("incorrect county name");


}

System.out.println("switch case with break ");

String county1="wake";

switch(county1) {

case "wake":
System.out.println("Morrisville");
break;

case "durham":
	System.out.println("Roxboro");
break;
	
case "orange":
	System.out.println("Chapelhill");
break;
	
	default:
		System.out.println("incorrect county name");


}

String county2="orange2";

switch(county2) {
case "wake1":
case "wake2":
	System.out.println("RDU");
break;

case "orange1":
case "orange2":
	System.out.println("Hillsboro");
break;

case "durham1":
case "durham2":
	System.out.println("hope valley");
break;



}

	}

}
