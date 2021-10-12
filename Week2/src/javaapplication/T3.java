package javaapplication;

/**
 *
 * @author Arnob
 */
import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>=1;j--)
        {
            if(j<=i)
            {
                System.out.print(j);
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
