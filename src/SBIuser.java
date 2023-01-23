import java.util.Objects;
import java.util.UUID;

public class SBIuser implements BankInterface {
private String name;
private String accountNo;
private int balance;
private String password;
private float rateOfInterest;


public SBIuser(String name, int balance, String password) {
	//super();
	this.name = name;
	this.balance = balance;
	this.password = password;
	
	this.rateOfInterest = 6.5f;
	this.accountNo = String.valueOf(UUID.randomUUID());
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getRateOfInterest() {
	return rateOfInterest;
}
public void setRateOfInterest(float rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
}
@Override
public double checkBalance() {
	// TODO Auto-generated method stub
	
	return this.balance;
}
@Override
public String addMoney(int money) {
	// TODO Auto-generated method stub
	balance = balance+money;
	return "Money added "+money+" new balance "+balance;
}
@Override
public String withdrawMoney(int amount, String enteredPassword) {
	// TODO Auto-generated method stub
	if(Objects.equals(enteredPassword,password)) {
		if(amount>balance) {
			return "Insufficient Balance";
		}
		else {
			this.balance = this.balance-amount;
			return "remaining balance "+this.balance;
		}
	}
	else {
		return "Wrong password !";
	}
	
}
@Override
public double calculateInterest(int years) {
	// TODO Auto-generated method stub
	float interest = (float) ((balance*years*rateOfInterest)/100);
	return interest;
}
}
