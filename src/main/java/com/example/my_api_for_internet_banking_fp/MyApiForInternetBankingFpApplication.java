package com.example.my_api_for_internet_banking_fp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApiForInternetBankingFpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApiForInternetBankingFpApplication.class, args);

        BankAccount bankAccount = new BankAccount();
        bankAccount.putMoney(1, 100);
        bankAccount.putMoney(2, 200);
        bankAccount.takeMoney(1, 50);
        bankAccount.transferMoney(1, 2, 50);
        bankAccount.getBalance(1);
        bankAccount.getBalance(2);
        bankAccount.getOperationList(1, "01.01.2019", "01.01.2020");



    }

}
