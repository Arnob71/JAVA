package task4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		AdvancedArithmetic r=new MyCalculator();
		System.out.print("Enter the number to show sum of it's divisors: ");
		int x=input.nextInt();
		System.out.println(r.divisorSum(x));
		System.out.print("Enter number to show it's factorial: ");
		int y=input.nextInt();
		System.out.println(r.findFactorial(y));

	}

}
