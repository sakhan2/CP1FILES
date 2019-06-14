import static java.lang.Math.*;
import java.util.Scanner;
public class abs{
	public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
		System.out.println("Enter int #1: ");
		System.out.println("Enter int #2: ");
		System.out.println("Enter first int");
		int one = scan.nextInt();
		System.out.print("Enter second int");
		int two = scan.nextInt();
		if ((Math.abs(one)) == (Math.abs(two)))
		{
		    System.out.println("abs are equal");
		  }
	}
}