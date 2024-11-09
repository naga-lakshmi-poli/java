import java.io.*;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
public class TestcustomException{
    static void validate(int age) throws InvalidageException{
    if(age<18){
        throw new InvalidAgeException("Age is not valid to vote");
    }
    else{
        System.out.println("Welcome to vote");
    }
}
public static void main(String args[]){
    try{ 
        validate(13);
    }
    catch(InvaliAgeException ex){
        System.out.println("Caught the exception");
        System.out.println("Exception occured: " +ex);
    }
    System.out.println("rest of the code... ");
}
    finally{
    System.out.println("In finally block");
    }

}
