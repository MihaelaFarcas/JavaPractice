package Homework;


import org.junit.Test;

//De facut o lista cu 10 numere si printam 3 dintre ele
public class Tema_3 {

    @Test
    public void Test_Automat() {
        // Lista_numere();
        AbonamentOrigym();
        // Afiseaza_DA();
        // Numere_divizibile_cu3();
        // Numere_divizibile_cu5();
        // Numere_pozitive_si_pare();
        //Exercitiu1(5,4,10);
        // Suma_numerelor();
    }

    public void Lista_numere() {
        Integer[] Lista_numere = new Integer[10];
        Lista_numere[0] = 10;
        Lista_numere[1] = 20;
        Lista_numere[2] = 30;
        Lista_numere[3] = 40;
        Lista_numere[4] = 50;
        Lista_numere[5] = 60;
        Lista_numere[6] = 70;
        Lista_numere[7] = 80;
        Lista_numere[8] = 90;
        Lista_numere[9] = 100;

        int pozitie = 0;

        while (pozitie < Lista_numere.length) {
            System.out.println(Lista_numere[pozitie]);
            pozitie = pozitie + 4;

        }

    }
    //Citim 3 numere cu valori diferite.
    //Daca suma primelor 2 numere este mai mare decat al 3-lea numar afisam un mesaj corespunzator
    // +valoarea sumei.altfel afisam contrariul.

    public Integer AbonamentZumba;
    public Integer AbonamentFitness;
    public Integer AbonamentFull;

    public void AbonamentOrigym() {
        int Suma = 170 + 170;
        AbonamentZumba = 170;
        AbonamentFitness = 170;
        AbonamentFull = 190;


        if (Suma > 190) {
            System.out.println("Prea scump,nu merg la Zumba si Fitness. Costa:"+ Suma);
        } else {
            System.out.println("Pret bun merg la Zumba si Fitness.");
        }

        if(AbonamentFull<Suma) {
            System.out.println("Merg la sala. Abonament Full:" + AbonamentFull);
        }else{
            System.out.println("Nu imi fac Abonament Full.");

        }


    }
    //Exercitiu de mai sus cu parametri

    public void Exercitiu1(int Nr1,int Nr2,int Nr3){
        int Suma=Nr1+Nr2;

        if(Suma>Nr3) {
            System.out.println("Suma este mai mare:" + Suma);
        }else{
            System.out.println("Suma este mai mica");
        }
    }

    //Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
    public void Afiseaza_DA() {
        System.out.println("Da "+"Da "+"Da "+"Da "+"Da ");
        System.out.print("DA ");
        System.out.print("DA ");
        System.out.print("DA ");
        System.out.print("DA ");
        System.out.print("DA ");
    }

    //Numere divizibile cu 3. Numere multiple de 3, care cresc din 3 in 3.
    public void Numere_divizibile_cu3(){
        int Pozitie;
        System.out.println("Numere divizibile cu 3: ");
        for (Pozitie=1;Pozitie<18; Pozitie++){
            if (Pozitie % 3 == 0){
                System.out.print(Pozitie + " ");
            }
        }
    }

    // Primele 3 numere divizibile cu 5.
    // Numere divizibile cu 5. Numere care cresc din 5 in 5.
    public void Numere_divizibile_cu5(){
        int Pozitie;
        System.out.println("Numere divizibile cu 5: ");
        for (Pozitie=1; Pozitie<30; Pozitie++){
            if (Pozitie % 5 == 0){
                System.out.print(Pozitie + " ");
            }
        }
    }
    //Primele 4 numere pozitive si pare.
    public void Numere_pozitive_si_pare(){
        int Pozitie;
        System.out.println("Numere pozitive si pare: ");
        for (Pozitie=2; Pozitie<10; Pozitie++){
            if (Pozitie % 2 == 0){
                System.out.print(Pozitie + " ");
            }
        }


    }
    //Suma numerelor pana la 10 (int suma=0;)
    public void Suma_numerelor(){
        int pozitie, suma=10;

        for(pozitie=1;pozitie<10;pozitie++){
            System.out.println("Suma numerelor pana la 10 este: "+suma);
        }
    }
    //Produsul numerelor pana la 5




}
