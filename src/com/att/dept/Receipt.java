package com.att.dept;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receipt {

	private String productName;
	private String productID;
	private long transactionID;
	private double productPrice;
	private int unitPurchased;
	private double amount;
	private Logger logger = LoggerFactory.getLogger(Receipt.class);

	public Receipt(String productName, String productID, double productPrice, long transactionID, int unitPurchased,
			double amount) {

		this.productName = productName;
		this.productID = productID;
		this.transactionID = transactionID;
		this.productPrice = productPrice;
		this.unitPurchased = unitPurchased;
		this.amount = amount;

		logger.info("Reciept Object Created");
	}

	public double calculateSubTotal() {
		return productPrice * unitPurchased;
	}

	public double calculateSalesTax() {

		return calculateSubTotal() * 0.0825;
	}

	public double calculateTotal() {
		return calculateSubTotal() + calculateSalesTax();
	}

	public double calculateBalance() {

		return amount - calculateTotal();
	}

	public void Reciept() {

		DateFormat dfRef = new SimpleDateFormat("MM/dd/yyyy");
		Date dateRef = new Date();
		System.out.println("--------------------------------------");
		System.out.println("          MY STORE 					  ");
		System.out.println("     123 ABRMS RD Dallas TX-----------");
		System.out.println("     STORE 5555555 					  ");
		System.out.println(" Transaction: 1234");
		System.out.println(dfRef.format(dateRef));
		System.out.println("--------------------------------------");
		System.out.println("Product Unit:" + unitPurchased);
		System.out.println("Unit Price:" + productPrice);
		System.out.println("Sub Total......" + calculateSubTotal());
		System.out.println("Tax(8.25%)....." + calculateSalesTax());
		System.out.println("Total....." + calculateTotal());
		System.out.println("--------------------------------------");
		System.out.println("Cash:" + "\t\t\t" + String.format("%5.2f", amount));
		System.out.println("Change:" + "\t\t\t" + String.format("%5.2f", calculateBalance()));
	}
}
