package Homework;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercises {
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Data;


    @Test
    public void Printeaza_textul (){
        System.out.println("Hello World");
        System.out.println("Farcas");
        System.out.println("Mihaela");

        Nume="Farcas";
        Prenume="Mihaela";
        Varsta=33;
        Data="28.03.2021";

        System.out.println("Rezultatul este:"+(2+(3*4)-3/3));

        //Asa se face concatenare la doua Stringuri (exemplul de mai jos)
        String consoana="Z";
        System.out.println("Ana"+consoana+" are"+consoana+" mere"+consoana+" pere"+consoana);
        System.out.println("Poti pleca acasa dupa ce iti verific munca!");

    }
    // Cum sa afisez data curenta?

    public static void main(String[]args){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date=new Date();

        System.out.println(sdf.format(date));
    }
}
