package com.Bank.App;

import com.Bank.DTO.Customer;
import java.util.Scanner;
import com.Bank.DAO.CustomerDAO;
import com.Bank.DAO.CustomerDAOImpl;

public class UpdateAccount {

	public static void updateAccount(Customer c) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		CustomerDAO cdao=new CustomerDAOImpl();
		
		System.out.println("Enter your field to be updated");
		do {
			
		System.out.println("1. Name");
		System.out.println("2. Phone Number");
		System.out.println("3. Email ID");
		System.out.println("4 exit to main menu");
		
		choice=sc.nextInt();
		switch(choice)
		{
		
		case 1:{
		System.out.println("Enter the new name:");
		c.setName(sc.next());
		boolean res=cdao.updateCustomer(c);
		//updateCustomer() already overridden in deposit module inside CustomerDAOImpl
		if(res)
		{
		System.out.println("Name updated to"+c.getName()+" successfully");
		}
		else
		{
		System.out.println("failed to update the name");
		}
		break;
		}
		
		case 2: {
			System.out.println("Enter the Phone number to be updated:");
			c.setPhone(sc.nextLong());
			boolean res=cdao.updateCustomer(c);
					//updateCustomer() already overridden in deposit module inside CustomerDAOImpl
			if(res)
			 {
				System.out.println("Phone number updated to "+c.getPhone()+" successfully");
				}
				else
				{
					System.out.println("failed to update the phone number");
				}
					break;
					}
		
		case 3: {
					System.out.println("Enter the Email ID to be updated:");
					
					c.setMail(sc.next());
					boolean res=cdao.updateCustomer(c);
					//updateCustomer() already overridden in deposit module inside CustomerDAOImpl
					if(res)
					{
					System.out.println("Mail ID updated to"+c.getMail()+" successfully");
					}
					else
					{
					System.out.println("failed to update the MailID");
					}
					break;
					}
		
	case 4: System.out.println("Exit to main menu");
			break;
		default:System.out.println("Invalid choice. Enter the correct choice!");
						}
						}
							while(choice!=4);
							}
							}