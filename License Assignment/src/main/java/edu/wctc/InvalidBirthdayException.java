package edu.wctc;

public class InvalidBirthdayException extends Exception{

    String message;

    public InvalidBirthdayException(int year, int month, int day)
    {
        message = year + "/" + month + "/" + day + " is not a valid date.";

    }
}
