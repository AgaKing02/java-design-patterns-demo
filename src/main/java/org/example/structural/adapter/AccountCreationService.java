package org.example.structural.adapter;

public class AccountCreationService {
    private int id;
    private String name;
    private String email;
    private Long amount;

    public AccountCreationService(int id, String name, String email, Long amount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public void createAccount(){
        System.out.println("Account has been created!!!");
    }
}
