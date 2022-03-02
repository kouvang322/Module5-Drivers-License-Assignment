package edu.wctc;

public class MissingNameException extends Exception{

    String message;

    public MissingNameException(String nameType){

        message = nameType + " can not be empty";
    }
}


//try{
//    asdasd
//
//}
//catch(edu.wctc.MissingNameException ex)
//        {
//            System.out.println(ex.message)
//        }