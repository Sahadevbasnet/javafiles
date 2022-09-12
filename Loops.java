package basicjava;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(initialization ; conditionCheck ; increment/decrement) { 
		//  } 
		  
//print from 0-2
		
	for(int i=0; i<2; i++) {
		//System.out.println(i);
		System.out.println("hello");
	}
	// print 1 to 10
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		//print 10 1
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("table of 2");
		// table of 2
	for(int i=2; i<=20; i=i+2) {
		System.out.println(i);
	}	
//for loop with break
System.out.println("break in for loop");
for(int i=0; i<5; i++) {
	if(i==2) {
	break;
}

System.out.println(i);

}

	//continue for loop

System.out.println("Continue for loop");
	
	
for(int i=-0; i<5; i++) {
	if(i==3) {
		continue;
	}
	System.out.println(i);
	
	
}

//While loop


System.out.println("while loop");


int t=0;
while(t<5) {
	System.out.println(t);
	t++;
}

//print 1 to 10
System.out.println("Print 1 to 10");
int t1 =0;
while(t1<10) {
	System.out.println(t1);
t1++;
}

//print 10 to 1

int t2=10;
	while(t2>=1) {
		System.out.println(t2);
		t2--;
	}

	
	System.out.println("table of 2 for while");

int t3=2;
while(t3<=20) {
t3=t3+2;
	System.out.println(t3);

}
	

System.out.println("break with while loop");

	int t4=0;
	while(t4<=10) {
		System.out.println(t4);
		if(t4==3) {
	break;
		}
		t4++;

	}
	
	System.out.println("continue with while loop ****");

//	int t5=10;
//	while(t5>1) {
//		if(t5==6) {
//
//	continue;
//		}
//		System.out.println(t5);
//t5--;
//	}
	
	System.out.println("continue while loop .....");
	
	int t6=0;
	while(t6<5) {
		if(t6==2) {
			t6++;
			continue;
		}
		System.out.println(t6);
		t6++;
		}
	
	System.out.println("hello");
	
	
	System.out.println("Progrma talb 5 in reverse");
	
	int i1=50;
	while(i1>=5)
	{
		System.out.println(i1);
		i1=i1-5;
				}
	
//	System.out.println("while loop for break");
//	
//	int i2=0;
//	while(i2<=5) {
//		if(i2==3) {
//			break;
//		}
//		System.out.println(i2);
//		i2++;
//	}
//	
//	
//	int i3=0;
//	while(i3<=5) {
//	if(i3==3) {
//		continue;
//	}
//	System.out.println(i3);
//	i3++;
//	}
//	
//	int i4=0;
//	while(i4<=5) {
//	if(i4==3) {
//		
//	//	i4 ++;
//		continue;
//	}
//	System.out.println(i4);
//	i4++;
//	}
//
//	
//
	System.out.println("do while");
	int i5=0;
	do {
		System.out.println("hello");
	i5++;
	}
	while(i5<=5);
	
	//program 1
	
	int[] age = new int[5];
	System.out.println(age);
	age[0]=10;
	age[1]=15;
	age[2]=20;
	age[3]=30;
	age[4]=40;
	System.out.println(age[0]);
	System.out.println(age.length);
	
	//lenght-1 is always last index
	
	//program 2
	int [] hiredate = new int[3];
	hiredate[0] = 1990;
	hiredate[1] = 1991;
	hiredate[2] = 1992;
	
	System.out.println(hiredate[0]);
	
	System.out.println(hiredate[1]);
	System.out.println(hiredate.length);
	
	
	
	int[] marks= {10, 20, 30, 40, 50, 46, 55};

	System.out.println(marks.length);
	System.out.println(marks[marks.length-1]);
	System.out.println(marks[2]);
	System.out.println(marks[3]);
	System.out.println(marks[4]);
	System.out.println(marks[6]);
	
	
	for(int i=0; i<7; i++) {
		System.out.println(i);
		System.out.println(marks[i]);
	}

	//program 4
	// 0 1 2 3 4 
System.out.println("String starting");
String[] names= {"Sahadev", "Kul", "Aayush", "Punam"};
System.out.println(names.length-1);
System.out.println(names[2]);


System.out.println("print the elements of array using for loop");
for(int i=0; i<names.length; i++) {
	//System.out.println(i);
	
	System.out.println(names[i]);
}
	
System.out.println("print the element of array using for while");
	
int i3=0;
while(i3<names.length) {
	System.out.println(names[i3]);
	i3++;
}
	
	// for loop in reverse
	System.out.println("for loop in reverse");
	for(int i= names.length-1; i>=0;i--) {
		System.out.println(names[i]);
	}		
		
	System.out.println("while loop in reverse");
	
int i4=names.length-1;
while(i4>=0) {

	System.out.println(names[i4]);
	i4--;
}
	
	
	
	

	
	}
	
}
	


