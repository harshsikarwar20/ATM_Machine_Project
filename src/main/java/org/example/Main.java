package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImplementation();
        int atmnumber = 12345;
        int atmPin = 123;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine...");
        System.out.print("Enter ATM Number : ");

        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin : ");

        int pin = sc.nextInt();
        if((atmnumber == atmNumber) && (atmPin==pin)){
            while(true){
                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View MiniStatement");
                System.out.println("5. Exist");

                System.out.println("Enter Choice : ");

                int choice = sc.nextInt();
                if(choice==1){
                    op.viewBalance();
                }
                else if(choice==2){
                    System.out.println("Enter amount to withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(choice==3){
                    System.out.println("Enter Amount to Deposit");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);

                }
                else if(choice==4){
                    op.viewMiniStatement();
                }
                else if(choice==5){
                    System.out.println(" Collect your ATM Card. \n Thank You for using ATM Machine...");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Valid Choice.");
                }

            }

//            System.out.println("Validation Done");

        }
        else{
            System.out.println("Incorrect ATM Number or PIN");
            System.exit(0);
        }

    }
}