package com.VersehoraMario.tema1;

public class Account {
    private int accountNo;
    private int amount;

    /* CNP has 13 digits, so I can't use int data type. I tried to use long data type that, theoretically,
     * should work, but I still got an error. So I chose to use the String data type to store the CNP.
     */
    private String nationalId;

    public Account() {}

    public void deposit(int amount) {
        this.amount += amount;
        System.out.println("New Sold: " + this.amount);
    }

    public void withdraw(double amount) throws NotEnoughMoneyException {
        if(this.amount < amount) throw new NotEnoughMoneyException("You do not have enough money to withdraw!");
        this.amount -= amount;
        System.out.println("New Sold: " + this.amount);
    }

    public void linkToNationalId(String nationalId) throws InvalidNationalIdException {
        // CNP must have only 13 digits
        if(nationalId.length() != 13) throw new InvalidNationalIdException("CNP is not valid!");

        // CNP must have only digits
        int verification = 1;
        for(int i = 0; i < nationalId.length(); i++) {
            if (!Character.isDigit(nationalId.charAt(i))) {
                verification = 0;
                break;
            }
        }
        if(verification == 0) throw new InvalidNationalIdException("CNP is not valid!");
        System.out.println("CNP is valid!");
    }



    // setters and getters

    public int getAccountNo() {
        return accountNo;
    }

    public int getAmount() {
        return amount;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
