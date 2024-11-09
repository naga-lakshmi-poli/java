import java.io.*;
import java.util.Scanner;
class Threadclassdemo implements Runnable{
    public void run(){
        System.out.println("Thread is created and is running");
    }
    public static void main(String args[]){
        Threadclassdemo ob=new Threadclassdemo();
        Thread t=new Thread(ob);
        t.start();
    }
}
