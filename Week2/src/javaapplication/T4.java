package javaapplication;

/**
 *
 * @author Arnob
 */
import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter first number: ");
     int fn=input.nextInt();
     System.out.print("Enter second number: ");
     int sn=input.nextInt();
     System.out.println("1. Addition (+)\n" +
                      "2. Subtraction (-)\n" +
                      "3. Multiplication (*)\n" +
                      "4. Division (/)");
    System.out.print("Enter operation number: ");
    int op=input.nextInt();
    int res=0;
    switch(op)
    {
        case 1:
         res=fn+sn;
         break;
        case 2:
         res=fn-sn;
         break;
        case 3:
         res=fn*sn;
         break;
        case 4:
         res=fn/sn;
         break;
        default:
        System.out.println("Wrong input");
    }
    System.out.println("The result is "+res);
    }
}
