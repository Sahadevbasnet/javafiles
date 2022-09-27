package basicjava;

public class RevsionABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student stu = new Student (10 , "Sahadev");
stu.read();
		
System.out.println(stu.grade);
System.out.println(stu.SchoolName);
	}

}


class Student {

	String StudentName = "Sahadev";
	
	int grade = 10;
	String StudnetName;
	static String SchoolName  = "Zorba";
	
	public Student(int gr , String name){
		this.grade = gr;
		this.StudentName = name;
	}
	
	public void read() {
		System.out.println("I can read");
		System.out.println(this.StudentName);
	}
	
	public static void Cal() {
		System.out.println("I can study");
	}
	
	
	
	
}

