package edu.wctc;

public class UnknownGenderCodeException extends Exception {
    String message;
    public UnknownGenderCodeException(char genderCode)
    {
        message = genderCode + " is unknown.";
    }
}