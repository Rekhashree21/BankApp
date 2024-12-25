package com.Bank.App;

import com.Bank.DTO.Customer;
import java.util.Iterator;
import java.util.List;
import com.Bank.DAO.TransactionDAO;
import com.Bank.DAO.TransactionDAOImpl;
import com.Bank.DTO.Transaction;

public class Passbook {

	public static void getPassbook(Customer c) {
		TransactionDAO tdao=new TransactionDAOImpl();
		List<Transaction>
		passbook=tdao.getTransaction(c.getAccno());
		Iterator<Transaction> it=passbook.iterator();
		while(it.hasNext())
		{
		Transaction t=it.next();
		System.out.println("<--------------------------------------->");
				System.out.println("TransactionID:"+t.getTransactionId());
				//+"||"+"Account_Number:"+t.getUser()+"||"+"Transaction Date");
				System.out.println("Account_Number:"+t.getRec_acc());
				System.out.println("TransactionType:"+t.getTransaction());
				System.out.println("Transaction Date:"+t.getDate());
				if(t.getTransaction().equals("CREDITED"))
				{
				System.out.println("+"+t.getAmount());
				System.out.println("CurrentBalance:"+t.getBalance());
				System.out.println("<--------------------------------------->");
				}
				else
				{
				System.out.println("-"+t.getAmount());
				System.out.println("CurrentBalance:"+t.getBalance());
				System.out.println("<--------------------------------------->");
						}
						}
						}
						}
		
	