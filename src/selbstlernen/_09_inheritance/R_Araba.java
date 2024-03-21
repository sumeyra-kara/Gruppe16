package selbstlernen._09_inheritance;

public class R_Araba {


    protected String str1="Araba";
    String str6;
    protected R_Araba(){
        System.out.println("Araba parametresiz Constructor calisti");
    }
    protected R_Araba(String str){
        System.out.println("Araba str parametreli Constructor calisti");
    }
    protected R_Araba(int a,int b){
        System.out.println("Araba iki int parametreli Constructor calisti");
    }
}
