package javaapplication;

/**
 *
 * @author Arnob
 */
import java.util.Scanner;
public class T5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=input.nextInt();
        System.out.print("Enter "+n+" integers: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=input.nextInt();  
        }
        System.out.print("Enter the number to search: ");
        int s=input.nextInt();
        int o=0;
        for(int i=0;i<n;i++)
        {
         if(s==arr[i])
         {
             o++;
         } 
        }
       System.out.println(s+" occured "+o+" times in the array.");
    }
}
