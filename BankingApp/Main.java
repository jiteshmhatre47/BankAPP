package BankingApp;

import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
    
          
        Registration r1 = new Registration();
          Scanner scanner = new Scanner(System.in);
           
             System.out.print(" Enter firstName => ");
             String firstName = scanner.nextLine();
             r1.setFirstName(firstName);
             System.out.println(r1.getFirstName());
 
             System.out.print(" Enter lastName => ");
             String lastName = scanner.nextLine();
             r1.setLastName(lastName);
 
             System.out.print(" Enter userName => ");
             String userName = scanner.nextLine();
             r1.setUserName(userName);
 
             System.out.print(" Enter password => ");
             String password = scanner.nextLine();
             r1.setPassword(password);
 
             System.out.print(" Enter emailId => ");
             String emailId = scanner.nextLine();
             r1.setEmailId(emailId);
 
             System.out.print(" Enter phoneNo => ");
             long phoneNo = scanner.nextLong();
             r1.setPhoneNo(phoneNo);
 
             System.out.println(r1.toString());

             Login l1 = new Login();
             l1.display(r1);



            


             BankingApp b1 = new BankingApp();
             Info i1 = new Info();
             i1.info(b1);
             b1.openAccount(b1);
             b1.showAccount(b1);
             b1.deposit(b1);
             b1.withdrawal(b1);
             
             
             
             
         }
        }

        
        
        
       
 

