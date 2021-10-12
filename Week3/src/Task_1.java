/**
 *
 * @author Arnob
 */
class Book{
    String Title,Author,Publication,Edition;
    int Price,Pages;
    
    void showinfo(){
        System.out.println(Title+" "+Edition+" edition");
        System.out.println("By "+Author);
        System.out.println(Pages+" pages");
        System.out.println("Price: "+Price+" tk");
        System.out.println(Publication+"\n");
    }
}
