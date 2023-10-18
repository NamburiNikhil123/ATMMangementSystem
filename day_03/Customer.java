package day_03;

abstract class Customer {
   protected static int count=1000;
   protected int id;
   protected String First_name;
   protected String Last_name;
   protected String Address;
   protected double balance;
   protected long mobilenumber;

   public Customer() {
	   this.id=count++;
}

public Customer(String first_name, String last_name, String address, double balance,long mobilenumber) {
	this.id=count++;
	this.First_name = first_name;
	this.Last_name = last_name;
	this.Address = address;
	this.balance = balance;
	this.mobilenumber=mobilenumber;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirst_name() {
	return First_name;
}

public void setFirst_name(String first_name) {
	First_name = first_name;
}

public String getLast_name() {
	return Last_name;
}

public void setLast_name(String last_name) {
	Last_name = last_name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public long getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}

  abstract public String Interest(int id);
   
}
class personal_account extends Customer{

	public personal_account() {
	}

	public personal_account(String first_name, String last_name, String address, double balance, long mobilenumber) {
		super(first_name, last_name, address, balance, mobilenumber);
	}

	@Override
	public String toString() {
		return "personal_account [id=" + id + ", First_name=" + First_name + ", Last_name=" + Last_name + ", Address="
				+ Address + ", balance=" + balance + ", mobilenumber=" + mobilenumber + "]";
	}

	@Override
	public String Interest(int id) {
		double interest;
		interest=getBalance()*0.02;
		return "The interest you will get is "+interest;
	}
	
}
class commercial_account extends Customer{
	private long work_mobilenumber;
	private String GST_Number;

	public commercial_account() {
	}

	public commercial_account(String first_name, String last_name, String address, double balance, long mobilenumber,long work_mobilenumber,String GST_Number) {
		super(first_name, last_name, address, balance, mobilenumber);
		this.work_mobilenumber=work_mobilenumber;
		this.GST_Number=GST_Number;
	
	}

	@Override
	public String toString() {
		return "commercial_account [id="
				+ id + ", First_name=" + First_name + ", Last_name=" + Last_name + ", Address=" + Address + ", balance="
				+ balance + ", mobilenumber=" + mobilenumber + "work_mobilenumber=" + work_mobilenumber + ", GST_Number=" + GST_Number +"]";
	}

	@Override
	public String Interest(int id) {
		double interest;
		interest=getBalance()*0.04;
		return "The interest you will get is "+interest;
	}


}