
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name,password,balance to create an account");
       String name = sc.nextLine();
       String password = sc.nextLine();
       int balance = sc.nextInt();
      
       SBIuser user = new SBIuser(name,balance,password);
       System.out.println("the new user name is "+user.getName());
       
       System.out.println("enter money to add");
       int money = sc.nextInt();
       user.addMoney(money);
       int newBalance = user.getBalance();       
       System.out.println("the new balance is "+newBalance);
       
       System.out.println("enter amount you want to withdraw");
       int amt = sc.nextInt();
       System.out.println("enter your password");
       String enteredPassword = sc.next();
       
       String bal = user.withdrawMoney(amt,enteredPassword);
       System.out.println(bal);
       
       System.out.println("the interest for 10 years");
       System.out.println(user.calculateInterest(10));
       System.out.println("total balance is"+user.getBalance());
       
	}

}
