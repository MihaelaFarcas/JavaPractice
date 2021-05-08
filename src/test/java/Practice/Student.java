package Practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String Nume;
    public String Facultate;
    public int An;
    public double Media;

    @Test
    public void Test_automat() {
       // Verifica_bursa(5);
       // Verifica_bursa(9);
       // Verifica_bursa_An(8.49,2);
       // Verifica_Facultate("Facultatea de Business");
       // Verifica_Facultate("Facultate de Business");
       // Verifica_Facultate("Liceul Teoretic Onisifor Ghibu");
        //Print_numere_mai_mari_ca_5();
        //Print_Nume();
        ListaFructe();
    }

    //Folosim structura alternativa if
    //if (conditia)then...else...

    public void Verifica_bursa(double MedieP) {
        Media = MedieP;

        if (Media >= 8.50) {
            System.out.println("Studentul primeste bursa");
        } else {
            System.out.println("Mai trebuie sa invete");
        }
    }

    public void Verifica_bursa_An(double MedieP, int AnP) {
        Media = MedieP;
        An = AnP;

        if (Media >= 8.50 & An > 2) {
            System.out.println("Studentul are bursa");
        } else {
            System.out.println("Mai trebuie sa invete");
        }
    }

    public void Verifica_bursa_An2(double MedieP, int AnP) {
        Media = MedieP;
        An = AnP;
        if (Media >= 8.50 || An > 1) {
            System.out.println("Studentul are bursa");
        } else {
            System.out.println("Mai trebuie sa invete");
        }
    }

    public void Verifica_Facultate(String FacultateP) {
        Facultate = FacultateP;
        if (Facultate.contains("Facultate")) {
            System.out.println("Persoana e student");
        }
        if (Facultate.equals("Facultate")) {
            System.out.println("Persoana e student");
        } else {
            System.out.println("Nu este la Facultate");
        }
    }

    //Structuri repetitive
    //Cele mai intalnite sunt for, while
    //Printam pe tastatura numerele care sunt mai mari ca 5, de la 1-10

    public void Print_numere_mai_mari_ca_5() {
        //Rezolvam cerinta cu for
        //for are 3 conditii de care trebuie sa tinem cont:
        // 1.pozitia de unde porneste
        // 2.conditia cand sa mearga. Adica cat sa mearga
        // 3.conditia din cat in cat sa creasca pozitia
        // Lucram cu pozitia! Nu cu valoarea.Valoarea este salvata pe pozitie.Pozitia incepe de la 0.
        // 0 este un numar intreg int. Daca vrei un alt interval,atunci pozitia incepe de la 5

        for (int Pozitie = 0; Pozitie < 1001; Pozitie++) {
            if (Pozitie > 100) {
                System.out.println(Pozitie);
            }
        }
    }

    // Definim o multime de elemente intr-un vector(array).Cand vrei sa declari o multime. Un Array se recunoaste
    // dupa paranteze [] 6 este numarul maxim de elemente pe care eu l-am dat.
    // Am declarat lista. Numerotarea incepe de la 0. Zero este vazut ca pozitie,nu ca si numar.
    // Diferenta dintre un Array si o Lista. Array are o dimensiune limitata,iar Lista este o dimens. infinita.

    public void Print_Nume() {
        String[] ListaNume = new String[6];
        ListaNume[0] = "Andrei";
        ListaNume[1] = "Sabina";
        ListaNume[2] = "Lucian";
        ListaNume[3] = "Edi";
        ListaNume[4] = "Miha";
        ListaNume[5] = "Grati";
        // Un array trebuie sa primeasca o dimensiune in momentul in care il declaram [6]
        // Ca sa adaugi un element intr-un array,specificam pozitia unde vrem sa punem elementul
        // Nu putem adauga mai multe elemente decat am stabilit la inceput.
        // Nu putem modifica pe parcurs dimensiunea unui array.

        // Varianta clasica in care merge din 1 in 1
        for (int Pozitie = 0; Pozitie < 6; Pozitie++) {
            System.out.println(ListaNume[Pozitie]);
        }

        // Varianta in care merge din 2 in 2
        for (int Pozitie = 0; Pozitie < 6; Pozitie = Pozitie + 2) {
            System.out.println(ListaNume[Pozitie]);
        }

        // Ca sa obtinem dimensiunea unui array ne folosim de nume array.lenth
        // Lenth-ul il regasim numai la array, el imi da dimensiunea listei mele,deci merge pana la capat.
        for (int Pozitie = 0; Pozitie < ListaNume.length; Pozitie++) {
            System.out.println(ListaNume[Pozitie]);
        }
    }

    //Facem metoda de mai sus cu while. While,nu stie sa creasca singur din 1 in 1.
    public void Print_Nume_while() {
        String[] ListaNume = new String[6];
        ListaNume[0] = "Andrei";
        ListaNume[1] = "Sabina";
        ListaNume[2] = "Lucian";
        ListaNume[3] = "Edi";
        ListaNume[4] = "Miha";
        ListaNume[5] = "Grati";

        int Pozitie = 0;
        while (Pozitie < ListaNume.length) {
            System.out.print(ListaNume[Pozitie]);Pozitie++;
        }
    }
    // O lista nu trebuie sa primeasca o dimensiune maxima
    // O lista trebuie sa contina un nume +tip de data
    // Se identifica dupa cuvantul List.Semnul ! este negarea. Lista este infinita la nivel de multime.
    // Poti face modificari.

    public void ListaFructe(){
        List<String> Fructe= new ArrayList<>();
        Fructe.add("mere");
        Fructe.add("capsuni");
        Fructe.add("zmeura");
        Fructe.add("afine");
        Fructe.add("banane");
        Fructe.add("ananas");
        Fructe.add("Mihaela");

        for (int Pozitie=0;Pozitie< Fructe.size();Pozitie++){
            if (Fructe.get(Pozitie).equals("mere")||Fructe.get(Pozitie).equals("zmeura")){
                System.out.println(Fructe.get(Pozitie));
            }
        }
        //Tema: Exemplul de mai sus cu ListaFructe sa-l facem cu while


    }
}
