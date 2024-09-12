import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int pos=-1;
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+"values of array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element to search: ");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                pos=i+1;
                break;
            }
        }
        if(pos==-1){
        System.out.println(key+" not found in the array.search unsucessfully key element not found");
    }
    else{
        System.out.println(key+"found at "+pos+"posyion in the array");
    }
    }
}
