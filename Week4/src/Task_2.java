/**
 *
 * @author Arnob
 */
class SeriesPrinter{
    void printSeries(int n){
       for(int i=0;i<=n;i++)
       {
          System.out.print(i);
       if(i!=n)
       {
          System.out.print(" "); 
       }
       }
    }
    void printSeries(int startIndex,int endIndex)
       {
       for(int i=startIndex;i<=endIndex;i++)
       {
          System.out.print(i);
       if(i!=endIndex)
       {
          System.out.print(" "); 
       }
       } 
       }
    void printSeries(int startIndex,int endIndex,int interval)
    {
       for(int i=startIndex;i<=endIndex;i=i+interval)
       {      
          System.out.print(i);
       if(i!=endIndex)
       {
          System.out.print(" "); 
       }
       }
    }
}
public class Task_2 {
    public static void main(String[] args) {
        SeriesPrinter obj;
        obj=new SeriesPrinter();
        obj.printSeries(5);
        System.out.print("\n");
        obj.printSeries(5,10);
        System.out.print("\n");
        obj.printSeries(5,15,3);
        System.out.print("\n");
    }
}
