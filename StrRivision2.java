package basicjava;

public class StrRivision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//program 1
		
		//Join two String concat
		
String name1 = "  Sahadev";
String name2= "  Basnet";
System.out.println(name1.concat(name2));
System.out.println(name2.concat(name1));


//program 2
// compare two string in java

String first = " I am learning java";
String second = " I am learning java";
String third = " I am not learning javascript";

boolean matchA = first.equals(second);
System.out.println(matchA);
boolean matchB = first.equals(third);
System.out.println(matchB);
boolean matchC = second.equals(third);
System.out.println(matchC);


//program 3
//Escape Sequence in String

String fourth = "Universal quote \"try try but donot cry\"";
System.out.println(fourth);

//Program 4

String city= new String("Nepal");

String upperCase= city.toUpperCase();
System.out.println(upperCase);

String Ktm= new String("Kathmandu");
String lowerCase =Ktm.toLowerCase() ;
System.out.println(lowerCase);

//Program 5 java is case sensitive

String five = "I am learning java and selenium";
boolean found = five.contains("java");
System.out.println(five.contains("at"));
System.out.println(found);
	


// conditional statement if (condition){statement} else {statement}
String vegetables = "Tomato Potato cabbage chilli peas";
String userinput = "Potato";

if(vegetables.contains(userinput)) {
	System.out.println(" vegetable is available");
}
	else {
		System.out.println("vegetible is not available");
	}

//Program 6 
//join()

String Str1 = "hello";
String Str2 = "Sahadev";
String Str3 = "Basnet";

String Str4 = String.join("-", Str1, Str2, Str3);
System.out.println(Str4);

String Str5 = String.join(" ", Str1, Str2, Str3);
System.out.println(Str5);

String Str6 = String.join("@", Str1, Str2, Str3);
System.out.println(Str6);


//Replace one character

String Str7 = "I am learning javascript and other than javascript";
String Str8 = Str7.replace("a", "b");
System.out.println(Str8);


//Replace all
System.out.println(Str7.replaceAll("javascript", "java"));

//Program 7 position of index on word
String Str9 = "Nepal";

int six = Str9.indexOf("l");
System.out.println(six);

int six1 = Str9.indexOf("-1");
System.out.println(six1);

vegetables = "Tomato Potato cabbage chilli peas";
int seven = vegetables.indexOf( "peas");
System.out.println(seven);
	

//program 8
//startsWith() and //endsWith()

String eight = "learning java is easy";
boolean starts = eight.startsWith("learning");
System.out.println(starts);

String nine = "learning java is easy";
boolean ends = nine.endsWith("easy");
System.out.println(ends);

	
//program 9 Empty

//isEmpty	


String ten = " a ";
boolean empty = ten.isEmpty();
System.out.println(empty);

//program 10
//trim

String eleven = "  Nepal  ";
String trim = eleven.trim();
System.out.println(trim);

System.out.println(eleven.length());

System.out.println(trim.length());


	}
	
	}


