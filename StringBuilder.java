import java.io.*;
import java.util.*;
class StringBuilderdemo1{
    public static void main(String args[]){
        StringBuilder sb1=new StringBuilder("Hello");
        sb1.append("Java");
        System.out.println("The string is " +sb1);
        StringBuilder sb2=new StringBuilder("Hello");
        sb2.insert(2,"Java");
        System.out.println("The string is " +sb2);
        StringBuilder sb3=new StringBuilder("Hello");
        sb3.replace(1,3,"Java");
        System.out.println("The string is " +sb3);
        StringBuilder sb4=new StringBuilder("Hello");
        sb4.delete(1,3);
        System.out.println("The string is " +sb4);
        StringBuilder sb5=new StringBuilder("Hello");
        sb5.reverse();
        System.out.println("The string is " +sb5);
        
    }
    
}
