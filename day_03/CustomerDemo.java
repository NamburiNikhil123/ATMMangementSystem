package day_03;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	int choice;
	int choice1;
	Bank bank=new Bank();
	String result="";
	
	
  do{
	System.out.println("1.Create a new Account");
	System.out.println("2.Withdraw");
	System.out.println("3.Deposit");
	System.out.println("4.Display all existing accounts");
	System.out.println("5.Money Transfer");
	System.out.println("6.Interest");
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	switch(choice){
	case 1:
		
		System.out.println("1.personal account");
		System.out.println("2.Commercial Account");
		System.out.println("Enter your choice");
		choice1=sc.nextInt();
		switch(choice1){
		case 1 :
			System.out.println("Enter your first name");
			String fname=sc.next();
			System.out.println("Enter your last name");
			String lname=sc.next();
			System.out.println("Enter your Address");
			String address=sc.next();
			System.out.println("Enter your first deposit");
			double balance=sc.nextDouble();
			System.out.println("Enter your mobile number");
			long mobilenumber=sc.nextLong();
			String result5=bank.addpersonalCustomer(fname, lname, address, balance, mobilenumber);
			System.out.println(result5);
			break;
		case 2 :
			System.out.println("Enter your first name");
			String fname1=sc.next();
			System.out.println("Enter your last name");
			String lname1=sc.next();
			System.out.println("Enter your Address");
			String address1=sc.next();
			System.out.println("Enter your first deposit");
			double balance1=sc.nextDouble();
			System.out.println("Enter your mobile number");
			long mobilenumber1=sc.nextLong();
			System.out.println("Enter your work mobile number");
			long work_mobilenumber=sc.nextLong();
			System.out.println("Enter GST number");
			String gstnumber=sc.next();
			String result1=bank.add_commercial_Customer(fname1, lname1, address1, balance1, mobilenumber1, work_mobilenumber,gstnumber);
			System.out.println(result1);
			break;
		}
		break;
     
	case 2:
		System.out.println("Enter your ID");
		int id2=sc.nextInt();
		System.out.println("Enter amount you want to withdraw");
		double amount2=sc.nextDouble();
		try{
			result=bank.withdraw(id2, amount2);
		}
		catch(balanceException e){
			e.printStackTrace();
		}
		System.out.println(result);
			break;
	case 3:
				System.out.println("Enter your ID");
				int id1=sc.nextInt();
				System.out.println("Enter amount you want to deposit");
				double amount1=sc.nextDouble();
				System.out.println(bank.deposit(id1, amount1));
				break;
	case 4:
				bank.displayALL();
				break;
	case 5: 
		    System.out.println("Enter Giver id");
	        int id3=sc.nextInt();
	        System.out.println("Enter Receiver id");
	        int id4=sc.nextInt();
	        System.out.println("Enter amount you want to transfer");
			double amount3=sc.nextDouble();
			System.out.println(bank.transfer(id3, id4, amount3));
	        break;
	case 6 :
		System.out.println("Enter your id");
        int id5=sc.nextInt();
        bank.tofindinterest(id5);
        break; 
          }
		}while(choice<=6);
  sc.close();
}
}