
package com.att.dept;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//This code is 
public class DepartmentStore {

	public String productName;
	public String productID;
	public long transactionID;
	public double productPrice;
	public int unitPurchased;
	public double amount;

	public void readValuefromKeyBoard() {
	
		Scanner scanRef = new Scanner(System.in);
		System.out.print("Enter Product Name:");
		productName = scanRef.next();
		System.out.print("Enter Product Id:");
		productID = scanRef.next();
		System.out.print("Transaction Id:");
		try { 
		transactionID = scanRef.nextLong();
		}
		catch (InputMismatchException e) {
			
			//System.err.println(e);
			System.out.print("Transaction Id should in numeric:");
			System.out.print("Transaction Id:");
			//throw
			try { transactionID = scanRef.nextLong(); } catch (Exception exp) {throw exp;}
		}
		System.out.print("Enter Product Price:");
		productPrice = scanRef.nextDouble();
		System.out.print("Enter How Many Unit Purchased:");
		unitPurchased = scanRef.nextInt();
		System.out.print("Enter Amount of Money Paid:");
		amount = scanRef.nextDouble();
		scanRef.close();
		
		Receipt r1 = new Receipt(productName, productID, productPrice, transactionID, unitPurchased, amount);	
		r1.Reciept();		
	}
	
	
	
}
