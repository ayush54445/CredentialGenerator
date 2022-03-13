package com.credential.main;
import com.credential.model.*;
import com.credential.service.*;
import java.util.*;

public class DriverClass {
	
    public static void main(String[] args) 
	{
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter First Name:");
    	String fname=scan.nextLine();
    	System.out.println("Enter Last Name:");
    	String lname=scan.nextLine();
    	
    	Employee e1=new Employee(fname,lname);
    	
    	Credentials cs=new Credentials();
    	
    	System.out.println("Please enter the department for the following:");
    	System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		System.out.println("---------------------");
		
		int option=scan.nextInt();
		
		switch(option) {
		case 1:
			cs.showCredentials(e1, "tech");
			break;
		case 2:
			cs.showCredentials(e1, "admin");
			break;
		case 3:
			cs.showCredentials(e1, "HR");
			break;
		case 4:
			cs.showCredentials(e1, "legal");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
		scan.close();
			
    			
//    	validate(email,password,e1){
//    		showMenu()
//    	}
		
	}
    
   
    		
    
}
