package com.credential.service;
import com.credential.model.*;
import java.util.Random;

public class Credentials {
  private String generatePassword() 
  {
	  Random r=new Random();
	  String password="";
	  for(int i=0; i<7;i++) {
		  password += (char)r.nextInt(33,123);
	  }
	  return password;
  }
	
 

  public String generateEmailAddress(Employee e1,String department) 
  {
	  return e1.getFirstName()+e1.getLastName()+"@"+department+"abc.com";
  }
  public void showCredentials(Employee e1,String department) 
  {
	  System.out.println("Dear"+e1.getFirstName()+"your generated credentials are as follow:");
	  System.out.println(this.generateEmailAddress(e1, department));
	  System.out.println(this.generatePassword());
	  
  }
}
