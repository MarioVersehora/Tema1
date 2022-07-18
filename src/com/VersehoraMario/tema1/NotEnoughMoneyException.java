package com.VersehoraMario.tema1;

public class NotEnoughMoneyException extends Exception {
    String message;

    public NotEnoughMoneyException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NotEnoughMoney Occured: " + message;
    }
}
