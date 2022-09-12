package basicjava;



class Bank{
	
	String customerName;
	String accType;
	int accNo;
	int balance;
	
	//Constructor
	
	Bank (String cxName, String accty, int accNo, int bal){
		
		this.customerName = cxName;
		this.accType = accty;
		this.accNo = accNo;
		this.balance= bal;
		
	}

	
	public  int deposit(int amount) {
		this.balance = this.balance+amount;
		System.out.println("Balance Updated");
		return this.balance;
	}

public int withdrawl(int amount) {
	if(this.balance >amount) {
		this.balance = this.balance - amount;

	System.out.println("Balance Updated");
return this.balance;
}

else {
	System.out.println("Insufficient Balance");
	return this.balance;
}

}
}


public class oopsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Bank sahadev = new Bank("Sahadev Basnet", "checking", 12345, 600000);
System.out.println(sahadev.customerName);
System.out.println(sahadev.accType);
System.out.println(sahadev.accNo);
System.out.println(sahadev.balance);

//deposit amount
int UpdatedBal=sahadev.deposit(10000);
System.out.println(UpdatedBal);
	
// withdraw
int balance= sahadev.withdrawl(2000);
System.out.println(balance);


int currentBal = sahadev.withdrawl(40000);
System.out.println(currentBal);

	}

}






