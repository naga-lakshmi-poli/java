import java.io.*;
import java.lang.*;
class Immutabledemo{
	public static void main(String args[])
	{
		String s="SASI";
		s.concat("SITE");
		System.out.println("After concatinating s1 & s2 - "+s);
		String s1="LAKSHMI ";
		s1=s1.concat("POLISETTI");
		System.out.println("After concatinating s1 & s2 - "+s1);
	}
}
