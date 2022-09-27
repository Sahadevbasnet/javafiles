package basicjava;

public class RevisonABC {

	
	public static void Calculator(int o , int p) {
		System.out.println(o+p);
		System.out.println(o-p);
		System.out.println(o*p);
		System.out.println(o/p);
		System.out.println(o%p);
	}
	
	public static void CalM() {
		System.out.println(5+5);
		
	}
	
	public static void CalN(int o , int p) {
		System.out.println(o+p);
		
	}
	
	public static int CalP(int o , int p) {
		System.out.println(o+p);
		return o + p;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String
		String FullName = "Sahadev";
		System.out.println(FullName);
		
		// Java is object --- property and method
		
		String myname = FullName.toUpperCase();
		System.out.println(myname);
		
		String myname1 = FullName.toLowerCase();
		System.out.println(myname1);
		
		//method chaining
		
		int abc = FullName.toUpperCase().toLowerCase().length();
		System.out.println(abc);
		
		//comparison relational operator
		

		// comparison relational operator
		// < , > , <= , >= , == , !=
		// entity < entity ----- boolean 
	int m = 10;
	int n = 20;
	System.out.println(m > n);
	System.out.println(m < n);
	System.out.println(m >= n);
	System.out.println(m <=n);
	System.out.println(m == n);
	System.out.println(m !=n);
	
	
	// Logical operators
			// AND, OR , NOT
			
			// AND operation
			// True && True ===>  True 
			// True && False ==>  False
			// False && True ==>  False
			// False && False ==> False
	
System.out.println( m<n && m!=n); 
System.out.println( m<n && m==n);
System.out.println( m>n && m!=n);
System.out.println( m>n && m==n);


//OR operator
		// True ||True ===>  True 
		// True || False ==>  True
		// False || True ==>  True
		// False || False ==> False

System.out.println( m<n||  m!=n); 
System.out.println( m<n || m==n);
System.out.println( m>n || m!=n);
System.out.println( m>n || m==n);


// NOT 
// True -- False
// False-- True
System.out.println(!( m<n||  m!=n)); 

// Conditional statements 
// input ---> mutiple outcomes -->
// numberT > 0 && numberT <= 7 --- 10 %
// numberT > 8 && numberT < = 12  --- 15 %
// numberT > 12  ---------- 30 %
	
int NumTicket = 40;

if(NumTicket> 0 && NumTicket<=7) {
	System.out.println(" we will get 10 percent discount");
	}

if(NumTicket>7 && NumTicket<=12) {
	System.out.println(" We will get 15 percent discount");
	}
if(NumTicket>12) {
System.out.println(" We will get 30 percent discount");
	}
		
if(NumTicket> 0 && NumTicket<=7) {
	System.out.println(" we will get 10 percent discount");
	}

else if(NumTicket>7 && NumTicket<=12) {
	System.out.println(" We will get 15 percent discount");
	}
else if(NumTicket>12) {
System.out.println(" We will get 30 percent discount");
	}



int mathMark = 81;

if(mathMark> 97) {
	System.out.println("A+ Grade");
	}

if(mathMark> 90) {
	System.out.println("A Grade");
	}

if(mathMark<90 && mathMark>80) {
	System.out.println("B+ Grade");
	}


if(mathMark> 97) {
	System.out.println("A+ Grade");
	}

else if(mathMark> 90) {
	System.out.println("A Grade");
	}

else if(mathMark<90 && mathMark>80) {
	System.out.println("B+ Grade");
	}

//Tenary operator


int x1= 10;
int y1 = 20;

if(x1 > y1) {
	System.out.println("x1 is greater");
}
else
	System.out.println("y1 is greater");

int max = (x1>y1) ? x1 : y1;

System.out.println(max);


int min = (x1<y1) ? x1 : y1;

System.out.println(min);


// Switch case

String county = "NC";
switch(county) {
case "cary":
case "morrisville":
	System.out.println("NC");
	break;
case "durham":
case "chapelhill":
	System.out.println("Orange county");
	break;
case "garner":
case "wake forest":
	System.out.println("North Raleigh");
	break;
default:
	System.out.println("Please wirte current county");
}

//Loops
//for(intiliazation ; conditionCheck; increment) {
//	// statement
//}

for(int i = 0 ; i <10 ; i++) { 
	System.out.println(i); 
}

for(int i = 0 ; i < 10 ; i++) { 
	System.out.println(i); 
	if(i == 5) {
		break;
	}
}
for(int i = 0 ; i <10 ; i++) { 
	if(i == 7) {
		continue;
	}
	System.out.println(i); 
}

System.out.println("while Operator");

//while 

		//intialization ; 
//		while(condition) {
//			// statement 
//			// increment / decremetn
//		}

int x2 = 10;
while(x2>0) {
	System.out.println(x2);
	x2--;
}
while(x2 > 0) {
	System.out.println(x2);
	if(x2 == 5) {
		break;
	}
	x2 --;
}

while(x2 > 0) {
	System.out.println(x2);
	if(x2 == 7) {
		continue;
	}
	x2 --;
}



// function
int x5 = 15;
int x6 = 20;

System.out.println(x5+x6);
System.out.println(x5-x6);
System.out.println(x5*x6);
System.out.println(x5/x6);
System.out.println(x5%x6);

int x7 = 50;
int x8 = 10;

System.out.println(x7+x8);
System.out.println(x7-x8);
System.out.println(x7*x8);
System.out.println(x7/x8);
System.out.println(x7%x8);




Calculator(22,3);
Calculator(200,100);

CalM();
CalM();

CalN(2,3);
CalN(2,1);

int AB = CalP(12,3);
System.out.println(AB);
System.out.println(AB + 10);



	}

}
