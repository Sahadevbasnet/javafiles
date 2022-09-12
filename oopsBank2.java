package basicjava;



public class oopsBank2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	NewBank dev = new NewBank("dev", 123, 1000);	
		//deposit amount
		
		
	
	System.out.println(dev.accName);
		int updatedBal = dev.deposit(500);
		System.out.println(updatedBal);
		updatedBal = dev.deposit(1200);
		System.out.println(updatedBal);
		
		
					
			

//withdraw
	int balance= dev.withdrawl(200);
System.out.println(balance);

balance= dev.withdrawl(100);
System.out.println(balance);

balance = dev.withdrawl(800);
System.out.println(balance);

}


}

class NewBank{
	String accName;
	int accNo;
	int balance;
	int count=0;
	
	
	//constructor
	
	NewBank(String nm, int acn, int bal){
		this.accName= nm;
		this.accNo = acn;
		this.balance =bal;
		count++;
	}
	
	public int deposit(int amount) {
		this.balance = this.balance + amount;
		System.out.println("Balance Updated");
		return this.balance;
		
}

	public int withdrawl(int amount) {
		if(this.balance> amount){
			this.balance = this.balance - amount;
		
		System.out.println( "Balance Updated");
		return this.balance;
	}
	else {
		System.out.println("Insufficient Balance");
		return this.balance;
	}

	

		
		
	}
}