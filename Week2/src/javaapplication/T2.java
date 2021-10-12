package javaapplication;

/**
 *
 * @author Arnob
 */
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x,p=0,n=0;
    for(int i=0;i<3;i++)
    {
    x=input.nextInt();
    if(x>=0)
    {
        p++;
    }
    else
    {
        n++;
    }
    }
    System.out.println(p+" Possitive numbers");
    System.out.println(n+" Negative numbers");
    }
}
