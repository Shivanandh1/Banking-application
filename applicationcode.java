package Atm;

import java.util.Scanner;

public class bankingapplication {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("shivanandh","441");
		obj.showMenu();
	}

}
 class BankAccount{
	 int balance;
	 int previousTransaction;
	 String customerName;
	 String customerId;
	 
	  BankAccount(String cname,String cid){
		  customerName=cname;
		  customerId=cid;
		  
		 
	 }
	 void deposit(int amount) {
		 if(amount!=0) {
			 
			 balance=balance+amount;
			 previousTransaction=amount;
			 
	}
		 		 
	 }
	 void withdraw(int amount) {
		 if(amount!=0) {
			 balance=balance-amount;
			 previousTransaction=-amount;
			 if(balance<0) {
				 System.out.println("not possible");
			 }
		 }
	 }
	 void getPreviousTransaction() {
		 if(previousTransaction>0) {
			 System.out.println("deposited:"+previousTransaction);
		 }
		 
		 else if(previousTransaction<0) {
			 System.out.println("withdraw:"+Math.abs(previousTransaction));
		 }
		 else {
			 System.out.println("NO transaction occured");
		 }
		 
		  if(balance<0) {
			 System.out.println("not possible to withdraw");
		 }
	 }
	 
	 void showMenu() {
		 char option='\0';
		 Scanner sc=new Scanner(System.in);
		 System.out.println("welcome"+customerName);
		 System.out.println("your id"+customerId);
		 
		 System.out.println("A: check your balance");
		 System.out.println("B: deposit");
		 System.out.println("C: withdraw");
		 System.out.println("D: previous transaction");
		 System.out.println("E: exit the system");
	 
		 do {
			 //System.out.println("");
			 System.out.println("===###===");
			 System.out.println("Enter your option");
			 System.out.println("===##===");
			 option =sc.next().charAt(0);
			 //System.out.println("\n");
			 
			 switch(option) {
			 case 'A':
				 System.out.println("-----");
				 System.out.println("Balance:"+balance);
				 //System.out.println("------");
				 //System.out.println("\n");
                 break;
                 
			 case 'B':
				 System.out.println("-----");
				 System.out.println("Enter an amont to deposit");
				// System.out.println("------");
				 
				 int amount=sc.nextInt();
				 deposit(amount);
				 System.out.println("\n");
                 break;
                 
			 case 'C':
				 System.out.println("-----");
				 System.out.println("Enter an amont to withdraw");
				 System.out.println("------");
				 
				 int amount2=sc.nextInt();
				 withdraw(amount2);
				 System.out.println("\n");
                 break;
			 case 'D':
                System.out.println("-----");
                getPreviousTransaction();
                System.out.println("-----");
               // System.out.println("\n");
                 
			 case 'E':
				 System.out.println("======");
				 break;
				 
			 default:
				 System.out.println("invalid option !! please enter correct option");
				 break;
             
		 }
	 
		 }
		 while(option !='E');
		 System.out.println("Thank you for using services");
	 }
		 
		 }
 
