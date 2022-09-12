package basicjava;

public class StringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name0="Sahadev";
System.out.println(name0);

//data type 
//introvert        extrovert
// less social    speaks more
// calm         loud
// talks less    speaks more(friendly)
	



// boolean  -- it can hold only tow values trure and fals
// int  --- 50, 81, 82 
// String ---- "sahadev", "Basnet"

// user defined data type

// person    sahadev
//property   height, weight, age , color, gender
// method -- talk(), walk(), sleep()

//vehicle -- toyota
// property -- color, model, type, regno
// method -- start(), stop(), 


//bank - BMO
// property --- accno, addressName, accName, accType
//method  ----- deposit(), withdral()

// Data type --- properties and method


//method --- action and return type

// toUpperCase()

String firstName = "sahadev"; // object is created
String upperCasefristName = firstName.toUpperCase();
System.out.println(upperCasefristName);


String name= "Nepal";
String name1= name.toUpperCase();
System.out.println(name1);


String name2 = name.toLowerCase();
System.out.println(name2);
	
	
	//lenght()

// action -- count number of character in string

// return- int

String city = "North Carolina";
int a5 = city.length();
System.out.println(a5);
System.out.println(a5+a5);



//Method Chaining

String country = "Nepal";
int a2= country.toUpperCase().toLowerCase().length();
System.out.println(a2);



// string + string = stirng
// number + string = String
//string + number = string
// number + numer = number

int a3 =10;
int b3 = 5;
String c3 = "hello";

System.out.println(a3+b3+c3);

System.out.println(c3+a3+b3);


	}

}
