import java.io.*;
import java.util.Scanner;
class Trycatch6{
    public static void main(String args[]){
        int a=5,b=0,c;
        int arr[]=new int[5];
        String str=null;
        try{
            c=a/b;
            
            arr[10]=200;
            System.out.println("The length of the string is" +str.length()); 
            throw new IOException();
        }
        catch(NullPointerException npe){
            System.out.println("NullPointerException caught" +npe);
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException caught" +ae);
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("ArrayIndexOutOfBoundsException caught" +ai);
        }
        catch(Exception e){
            System.out.println("Exception caught" +e);
        }
        finally{
            System.out.println("In finally block");
        }
    }
}
