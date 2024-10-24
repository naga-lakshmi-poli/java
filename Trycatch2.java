import java.io.*;
import java.util.Scanner;
class Trycatch2{
    public static void main(String args[]){
        int a=5,b=0,c;
        try{
        c=a/b;
        System.out.println("value of c is :" +c);
        }
    catch(Exception e)
    {
      System.out.println("Exception caught");
    }
    }
    
}
