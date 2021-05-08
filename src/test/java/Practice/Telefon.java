package Practice;

public class Telefon {
    //Definim atribute generale pentru obiecte

    public String Marca;
    public String Sistem_de_operare;
    public String Model;
    public String Camera;

    //Constructor= are ca rol sa initializeze variabilele unei clase
    //Constructor=public+numele clasei curente +(){}
    //Constructorul=nu are void sau return
    //Constructor=intr-o clasa putem defini o multime de constructori, nu avem limita.
    //Constructori= 2 tipuri, Implicit si Explicit(cu parametri)
    //Daca nu am declarat un constructor implicit->by default avem unu


    public Telefon(){
        //Constructori de tip implicit
    }
    public Telefon (String Marca,String Sistem_de_operare,String Model,String Camera){
        //this = un keyword care face referire la o variabila din clasa
        //Daca o clasa are o variabila cu numele X+metoda din clasa
        //are un parametru cu acelasi nume X rezulta-> ca sa fac referire la variabila din clasa=this.X=X

        this.Marca=Marca;
        this.Sistem_de_operare=Sistem_de_operare;
        this.Model=Model;
        this.Camera=Camera;
    }

    //Facem un constructor pentru telefoanele cre nu au camera

    public Telefon(String Marca,String Sistem_de_operare,String Model){
        this.Marca=Marca;
        this.Sistem_de_operare=Sistem_de_operare;
        this.Model=Model;
    }
    //Facem o metoda care printeaza marca telefonului
    public void PrintMarca(){
        System.out.println("Marca telefonului este:"+Marca);
    }
    public void PrintSistem(){
        System.out.println("Sistemul telefonului este:"+Sistem_de_operare);
    }
    public void PrintModel(){
        System.out.println("Modelul telefonului este:"+Model);
    }

    public void PrintCamera(){
        //scriem semnul diferit -> != Camera este diferit de null
        if (Camera!=null){
            System.out.println("Modelul camerei este:"+Camera);
        }
        else{
            System.out.println("Modelul telefonului nu are camera");

        }
    }
}
