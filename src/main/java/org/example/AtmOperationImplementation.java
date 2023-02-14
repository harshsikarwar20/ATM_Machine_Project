package org.example;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements AtmOperationInterface{
    ATM atm = new ATM();

    HashMap<Double , String> ministatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<=atm.getBalance()){
                ministatement.put(withdrawAmount , "Amount withdrawn");
                System.out.println("Collect the cash : " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }else{
                System.out.println("Insufficient Balance !!");
            }
        }else{
            System.out.println("Please enter the amount in multiple of 500 ");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatement.put(depositAmount , "Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m : ministatement.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
    }
}
