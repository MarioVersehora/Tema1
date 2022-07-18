package com.VersehoraMario.tema1;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, InvalidNationalIdException {
        Account account = new Account();

        account.setAccountNo(10);
        System.out.println("AccountNo: " + account.getAccountNo());

        account.setAmount(1500);
        System.out.println("Amount: " + account.getAmount());
        account.deposit(100);
        account.withdraw(1000);
        // account.withdraw(800);                     * Exception will be thrown *

        account.setNationalId("5010311460142");
        account.linkToNationalId(account.getNationalId());
        // account.setNationalId("50103114601P2");    * Exception will be thrown(I added a letter in CNP) *
        // account.linkToNationalId(account.getNationalId());
        account.setNationalId("50103114601429");     /* Exception will be thrown(CNP has 14 digits) */
        account.linkToNationalId(account.getNationalId());

    }
}
