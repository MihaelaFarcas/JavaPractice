package Practice;

import org.junit.Test;

public class Persoana {
    //Identificam o clasa dupa cuvantul class
    //Structura unei clase: public class Nume Clasa
    //Colectie de atribute si metode
    //Atribute=Variabile
    //Fiecare variabila trebuie sa aiba un tip si un nume

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public double Inaltime;

    // Metoda= o actiune specifica unei clase
    //Putem defini intr-o clasa mai multe metode
    //Structura unei metode: public type Numele metodei () {}
    //Metodele pot sa fie void si return

    //Facem o metoda de test care sa contina metodele de mai jos.
    // Atentie la PrintInfoParametri, la valori trebuiesc sterse ghilimelele 10, 1.63

    @Test
    public void Test_automat(){
        //Chem metoda Print_informatii pe care am facut-o mai jos, scriu: denumirea metodei();
        //Print_informatii();
        //PrintInfoParametri("Marginean","Ioana",10,1.63);
        //PrintInfoParametri("Farcas","Sofia",5,1.21);
       //AdunareNumere(33,10,4);
       Get_adunare_rezultat(10,14,15);
       System.out.println(Get_adunare_rezultat(10,14,15));

    }

    public void Firstmethod(){
        //Printam in consola cuvantul Hello World
        //Aceasta metoda este o metoda clasica
        //Vrem sa facem o metoda de test: folosim junit
        //Metoda de test= @Test
        System.out.println("Hello World");
        System.out.println("Mihaela Farcas");
        System.out.println("Test");
        //print=printeaza textul si ramane textul pe acelasi rand
        //println=printeaza textul si trecepe randul urmator
        //Atribuim o valoare unei variabile folosind semnul =
        Nume="Azimut";

        //Printam valoarea variabilei nume
        System.out.print(Nume);
    }
    @Test
    public void Print_informatii(){
        Nume="Farcas";
        Prenume="Mihaela";
        Varsta=33;
        Inaltime=1.64;

        System.out.println("Numele este:"+Nume);
        System.out.println("Prenumele este:"+Prenume);
        System.out.println("Varsta este:"+Varsta);
        System.out.println("Inaltimea este:"+Inaltime);
    }
    //Facem metoda de mai sus folosind parametri
    //O metoda poate avea mai multi parametri
    //Ei se definesc in interiorul parantezelor rotunde()
    //Un parametru= trebuie sa aiba un tip de data +nume

    public void PrintInfoParametri(String NumeP,String PrenumeP,Integer VarstaP,double InaltimeP){
        Nume=NumeP;
        Prenume= PrenumeP;
        Inaltime=InaltimeP;

        System.out.println("Numele este:"+Nume);
        System.out.println("Prenumele este:"+Prenume);
        System.out.println("Varsta este:"+Varsta);
        System.out.println("Inaltimea este:"+Inaltime);
    }

    public void AdunareNumere (Integer varsta,Integer nr1,Integer nr2){
        Integer Suma=nr1+nr2;
        int rezultat=varsta+Suma;

        System.out.println("Rezultatul este:"+rezultat);
    }

    //Metoda cu return
    //Facem o metoda cu return folosind exemplu de mai sus

    public int Get_adunare_rezultat(Integer varsta, Integer nr1, Integer nr2) {
        Integer Suma = nr1+nr2;
        int rezultat = varsta+Suma;
        return rezultat;
    }


}

