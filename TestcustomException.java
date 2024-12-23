import java.io.*;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class TestCustomException {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13); // Testing with age 13
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + ex);
        } finally {
            System.out.println("In finally block");
        }

        System.out.println("Rest of the code...");
    }
}
