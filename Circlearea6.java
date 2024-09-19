import java.io.*;
import java.util.Scanner;
class Circlearea6
{
    double r;
    Circlearea6()
    {
        r=0;
    }
    Circlearea6(double r){
        this.r=r;
    }
    
    double area(){
        return(22/7.0)*r*r;
    }
    double area(double x){
        return(22/7.0)*x*x;
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
	    Circlearea6 c1=new Circlearea6();
	    Circlearea6 c2=new Circlearea6(3.6);
	    Circlearea6 c3=new Circlearea6(5);
	    System.out.println("Area of 1st circle is "+c1.area());
	    System.out.println("Area of 1st circle updated is "+c1.area(8));
	    System.out.println("Enter redius of  circles to find the area:");
	    double radius=sc.nextDouble();
	    Circlearea6 c4=new Circlearea6();
	    c4.setCircle(radius);
	    System.out.println("Area of  circle is"+c4.area());
		System.out.println("Area of 2nd circle is"+c2.area());
		System.out.println("Area of 3rd circle is"+c3.area());
	}
}
