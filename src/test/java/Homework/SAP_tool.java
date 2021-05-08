package Homework;

import org.junit.Test;
//Am creat o clasa noua
//Am pus variabile String,Integer,double
//Am facut o metoda public void si am denumit-o Afiseazatranzactii (){ in interior am dat valori}
//Am printat pe tastatura folosind System.out.println("Text");
//@Test se pune mereu deasupra la public void

public class SAP_tool {
    public String TranzactiiDisplay;
    public String TranzactiiChange;
    public Integer POnumber;
    public double POamount;

    @Test
    public void Afiseazatranzactii (){
        TranzactiiDisplay="Display Purchase Order";
        TranzactiiChange="Change Purchase Order";
        POnumber=440059227;
        POamount=500.525;

        System.out.println("The future belongs to those who believe in the beauty of their dreams");
        System.out.println("Tranzactii necesare pentru Procurement team");
        System.out.println("PO-ul 440059227 trebuie inchis.");
        System.out.println("Trebuie facut follow-up cu end-userii pentru factura");
    }
}
