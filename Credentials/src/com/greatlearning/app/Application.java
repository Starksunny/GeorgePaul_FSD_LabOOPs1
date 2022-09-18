package com.greatlearning.app;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Application {
 public static void main(String[]args) {
	 Employee emp = new Employee("George","Paul");
	 CredentialService cs = new CredentialService();
	 String generatedEmail;
	 char[]generatedPassword;
	 System.out.println("Please enter the department from the following ");
	 System.out.println("1. Technical");
     System.out.println("2. Admin");
	 System.out.println("3. Human Resource");
	 System.out.println("4. Legal");

	 Scanner sc = new Scanner(System.in);
	
	 
	 
	 int input = sc.nextInt();
	 
	 switch(input) {
	 
	 case 1:{
		 generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"tech");
		 generatedPassword = cs.generatePassword();
		 cs.showCredentials(emp, generatedEmail, generatedPassword);
	 }break;
     case 2:{
    	 generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"Admin");
		 generatedPassword = cs.generatePassword();
		 cs.showCredentials(emp, generatedEmail, generatedPassword);
     }break;
     case 3:{
    	 generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"Human Resource");
		 generatedPassword = cs.generatePassword();
		 cs.showCredentials(emp, generatedEmail, generatedPassword);
     }break;
     case 4:{
    	 generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"Legal");
		 generatedPassword = cs.generatePassword();
		 cs.showCredentials(emp, generatedEmail, generatedPassword);
     }break;
    }
  }
}