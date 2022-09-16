package BankingApp;

import java.util.Scanner;


public class Login{
    


    void display(Registration r1){
          
          
        Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter username => ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
System.out.println("username = "+r1.getUserName());
System.out.println(r1);

            if (userName.equals(r1.getUserName()) && password.equals(r1.getPassword()))
            {
                System.out.println(" User successfully logged-in.. ");
            } 


            else 
            {
                System.out.println(" In valid userName or password ");
            }
            
        }}
        
    


