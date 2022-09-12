package basicjava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// When we use array
	//Datatype [] arrayName = new Datatype()
	
		
//Program 1
	
	//Array stores the value by index
		String [] names = new String [4];
		
		names[0] = "Sahadev";
		names[1] = "Sudha";
		names[2] = "Susan";
		names[3] = "Sonu";
		
		System.out.println(names [0]);
		System.out.println(names [1]);
	
// Another way to define of Array
		
	String [] names1 = {"Sahadev", "Sudha", "Susan", "Sonu"};
	
	System.out.println(names1[0]);
	System.out.println(names1[3]);	
	
	
	// Program 2 Array of integers
	
	int[] numbers = new int[4];
	numbers[0] = 10;
	numbers[1] = 20;
	numbers[2] = 30;
	numbers[3] = 40;
	
	System.out.println(numbers[0]);
	System.out.println(numbers[3]);
	
	int [] numbers2 = {10, 20, 30, 40};
	System.out.println(numbers2[3]);
	System.out.println(numbers2.length);
	
	
	//program 3 how to access the element of array
	
	String [] cities ={"Mossrivile", "Apex", "Cary", "Raleigh", "Garner"};
	System.out.println(cities[0]);
	System.out.println(cities[3]);
	
	
	//Total numbers of elements of array
	
	int a = cities.length;
	System.out.println(a);
	System.out.println(cities[cities.length-1]);
	
	//program 4 (print every elements of array)
	
	
	System.out.println("Printing all elements of arrary");
	
	String [] fruits = {"apple", "banana", "Mango", "guava", "orange"};
	
for(int i=0; i<fruits.length; i++) {
	System.out.println(i);
}
	for(int i=0; i< fruits.length; i++) {
	System.out.println(fruits[i]);
	
}
int [] numbers3 = {10, 20, 30, 40, 50};
for(int i=0; i<numbers3.length; i++) {
//	System.out.println(i);
System.out.println(numbers3[i]);

}
System.out.println("array numbers in reverse");

//Program 5
// print all value of array in reverse

int[] numbers4 = {11, 111, 1111, 11111, 11111};
for(int i=numbers4.length-1; i>=0; i--) {
	System.out.println(numbers4[i]);
}

String [] vegetables = {"Potato", "Tomato", "Cabbage", "Pumkin"};

for(int i=vegetables.length-1; i>=0; i--) {
	System.out.println(vegetables[i]);
}

//Program 6
//Using for each loop
System.out.println("using for each loop");
int [] age = {11,12,13,14,15,16};


for(int ag:age) {
	System.out.println(ag);
}

String[] countries = {"Nepal", "India", "Canada", "USA"};

for(String country:countries) {
	System.out.println(country);
}
	
//Program 7

int[] numbers5 = {10, 20, 30, 40, 50, 60, 70};
int sum = 0;
for(int i=0; i<numbers5.length; i++) {
	//System.out.println(numbers5[i]);
sum = sum+numbers5[i];
System.out.println(sum);

}

//Program 8
//Average of all elements of array

System.out.println("Average of array");

int [] ages5 = {10, 15, 20, 25, 30};
int total = 0;

for(int i=0; i<ages5.length; i++) {

	total = total+ages5[i];
//System.out.println(ages5[i]);	
//System.out.println(total/ages5.length);
}
System.out.println(total/ages5.length);

//object
//human --> Sahadev
//Property ---- weight, height, color
//method ------ walk(), sleep(), talk()

//vehicle ---- toyota
// property ---- color, MovelNumber, RegNO
//Method ---- Start(), Stop()

//Bank --- BMO
// Property ---- AccNo, AccName, Address
//Method  ----- deposit(), withdrawl()


//birthYear --- 1980
//calculateAge() 2022-1980
//Method -- action and return type


	}
}
