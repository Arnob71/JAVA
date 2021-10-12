/**
 *
 * @author Arnob
 */
public class Task_2 {
    public static void main(String[] args) {
        Book book1,book2,book3;
        book1=new Book();
        book2=new Book();
        book3=new Book();
        
        book1.Title="JAVA for Beginners";
        book1.Edition="3rd";
        book1.Author="Prof. David";
        book1.Pages=537;
        book1.Price=299;
        book1.Publication="Easy Coding Publications";
        book2.Title="Omega Point";
        book2.Edition="12th";
        book2.Author="Humayun Ahmed";
        book2.Pages=122;
        book2.Price=128;
        book2.Publication="Shomoy Prokashoni";
        
        book3.Title="Digital Fortress";
        book3.Edition="5th";
        book3.Author="Dan Brown";
        book3.Pages=356;
        book3.Price=520;
        book3.Publication="St. Martin Press";
        
        book1.showinfo();
        System.out.println(" ");
        book2.showinfo();
        System.out.println(" ");
        book3.showinfo();
        System.out.println(" ");
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        
        book1=book3;
        book1.Edition="1st";
        System.out.println(" ");
        book3.showinfo();
        System.out.println(" ");
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }   
        
}