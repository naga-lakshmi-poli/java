import java.io.*;
import java.util.Scanner;
class Circlearea4
{
    double x,y,r;
    Circlearea4()
    {
        x=0;
        y=0;r=0;
    }
    double area(){
        return(22/7.0)*r*r;
    }
    void setCircle(double r)
    {
        this.r=r;
    }
}
    class Main
    {
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Circlearea4 ob1=new Circlearea4();
	    Circlearea4 ob2=new Circlearea4();
	    System.out.println("Enter redius of two circles:");
	    double radius1=sc.nextDouble();
	    double radius2=sc.nextDouble();
		ob1.setCircle(radius1);
		ob2.setCircle(radius2);
		System.out.println("Area of 1st circle is"+ob1.area());
		System.out.println("Area of 2nd circle is"+ob2.area());
	}
}
