package com.VersehoraMario.tema1;

public class InvalidNationalIdException extends Exception {
    String message;

    public InvalidNationalIdException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidNationalIdException Occured: " + message;
    }
}
