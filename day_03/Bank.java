package day_03;

import java.util.*;

class balanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "Insufficient Balance";
	}
}
public class Bank {

	List<Customer> customerList = new ArrayList<>();
	public String addpersonalCustomer(String fname,String lname,String address,double balance,long mobilenumber){

		Customer cust = new personal_account(fname,lname,address,balance,mobilenumber);

		customerList.add(cust);

		return "Your Personal account created Successfully !!your  id is :"+cust.getId();

	}
	public String add_commercial_Customer(String fname,String lname,String address,double balance,long mobilenumber,long work_mobilenumber,String GSTnumber){
		Customer cust =new commercial_account(fname,lname,address,balance,mobilenumber,work_mobilenumber,GSTnumber);
		customerList.add(cust);
		return "Your Commercial account created Successfully !! your id is :"+cust.getId();
	}

		public String  deposit(int id,double amount){
				for(Customer list:customerList){
					if(list.getId()==id){
					list.setBalance(list.getBalance()+amount);
					return "Amount deposited Successfully. Your new balance is " +list.getBalance();
				}			
			}
			return "customer not found";
		}
		public String  withdraw(int id,double amount) throws balanceException{
			for(Customer list:customerList){
				if(list.getId()==id){	
					if(amount>list.getBalance()){
						throw new balanceException();
					}
					else{
						list.setBalance(list.getBalance()-amount);
					return "Amount withdrawn Successfully.Your new balance is " +list.getBalance();
					}
				}			
			}
			return "customer not found";
		}

		public void displayALL(){

			for(Customer list:customerList){

				System.out.println(list);
			}
		}
	    public String transfer(int fromid,int toid,double tmoney){
	    	for(Customer list:customerList){
	    		for(Customer list1:customerList){
				if(list.getId()==fromid && list1.getId()==toid){
					if(tmoney>list.getBalance()){
						return "Insufficient funds";
					}
					else{
						list.setBalance(list.getBalance()-tmoney);
						list1.setBalance(list1.getBalance()+tmoney);
						return "Money transer successfully.\n New balances for "+fromid+" is "+list.getBalance()+"\n New balance for "+toid+" is "+list1.getBalance();
					}
				}
	    	}
	    }
	    	return "customer not found";
	    }
	    public void tofindinterest(int id){
	    	for(Customer list:customerList){
	    		if(list.getId()==id){
	    			System.out.println(list.Interest(id));
	    		}
	    		System.out.println("Customer not found");
	    	}
	    }
	}
