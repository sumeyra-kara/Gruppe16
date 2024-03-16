package selbstlernen.inheritance;

public class R_Toyota extends R_Araba {

    protected String str2="Toyota";
    String str5;

    protected R_Toyota(){
        this("Java");
        System.out.println("Parametresiz Toyota Constructor'u calisti");
    }
    protected R_Toyota(int sayi){
        System.out.println("Int Parametreli Toyota Constructor'u calisti");
    }
    protected R_Toyota(String s){

        //super(); burada gizli bir super vardir bu classta extends oldugu icin
        System.out.println("String parametreli Toyota Constructor'u calisti");
    }

}
