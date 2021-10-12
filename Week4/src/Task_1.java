/**
 *
 * @author Arnob
 */
class Smartphone{
    String brand,model,osversion;
    
    Smartphone(){
        brand="Samsung";
        model="Galaxy S21 Ultra 5G";
        osversion="Android 11";
    }
    Smartphone(String brand,String model,String osversion){
        this.brand=brand;
        this.model=model;
        this.osversion=osversion;
    }
}
public class Task_1 {
    public static void main(String[] args) {
        Smartphone sp;
        sp=new Smartphone();
        Smartphone sp2;
        sp2=new Smartphone("Apple","iPhone 12 Pro Max","iOS 14.1");
        Smartphone sp3;
        sp3=new Smartphone("Huawei","P50 Pro","HarmonyOS 2.0");
    }
    
}