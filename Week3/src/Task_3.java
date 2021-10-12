/**
 *
 * @author Arnob
 */
class BillCalculator{
    double calculateBasicBill(double unit){
    double basicBill=0;
        if (unit<=199)
        {
            basicBill=1.20*unit;
        }
        else if (unit>=200&unit<400)
        {
            basicBill=1.50*unit;
        }
        else if (unit>=400&unit<600)
        {
            basicBill=1.80*unit;
        }
        else if (unit>=600)
        {
            basicBill=2.00*unit;
        }
        if(unit==0|basicBill<100)
        {
            basicBill=100;
        }
        return basicBill;
    }
    double calculateSurcharge(double basicBill){
        return basicBill*0.15;
    }
    double getTotalBill(double unit){
        double bb,sc=0;
        bb=calculateBasicBill(unit);
        if(bb>400)
        {
            sc=calculateSurcharge(bb);
        }
        return bb+sc;
    }
}
public class Task_3 {
    public static void main(String[] args) {
    double b;
    BillCalculator bill;
    bill=new BillCalculator();
    b=bill.getTotalBill(25);
    System.out.println(b);
    b=bill.getTotalBill(250);
    System.out.println(b);
    b=bill.getTotalBill(812);
    System.out.println(b);
    }
}
