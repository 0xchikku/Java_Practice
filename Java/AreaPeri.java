import java.io.*;
import java.util.*;

public class AreaPeri{
	public static void main(String[] args)throws IOException{
		double a,b,c,h,area,peri;
		System.out.println("Enter The value of a,b,c,h: ");

		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		h = s.nextInt();

		peri = a+b+c;
		area = (0.5*b*h);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + peri);
	}
}