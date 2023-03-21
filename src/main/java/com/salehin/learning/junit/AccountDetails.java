package com.salehin.learning.junit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountDetails {
    private String name;
    private Integer accountNumber;
    private Integer customerId;
    private float balance;
    private String accountType;

    public void deposit(float depositAmount){
        balance = balance + depositAmount;
    }

    public boolean withdraw(float withdrawAmount){
        if(withdrawAmount > balance){
            System.out.println("Insufficient balance");
            return false;
        } else{
            balance -= withdrawAmount;
            return true;
        }
    }

}
