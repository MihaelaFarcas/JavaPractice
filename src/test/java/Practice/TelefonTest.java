package Practice;

import org.junit.Test;

public class TelefonTest {
    @Test
    public void Telefon(){
        //obiect=instanta unei clase
        //Structura:obiectul=nume clasa +nume obiect=new numele clasei()
        //Poti sa declari cate obiecte vrei
        //Obiectul iti da posibilitatea sa accesezi variabile sau metode din clasa respectiva

        Telefon Iphone=new Telefon("Iphone","IOS","11","5");
        Telefon Samsung=new Telefon("Samsung","Android","S10","3");
        Iphone.PrintMarca();
        Samsung.PrintMarca();

        Iphone.PrintSistem();
        Samsung.PrintSistem();

        Iphone.PrintModel();
        Samsung.PrintModel();
        Samsung.PrintCamera();

        //Facem un obiect in care sa apelam alt constructor

        Telefon Nokia=new Telefon("Nokia","Simbian","3310");
        Nokia.PrintMarca();
        Nokia.PrintSistem();
        Nokia.PrintModel();
        Nokia.PrintCamera();


    }
}
