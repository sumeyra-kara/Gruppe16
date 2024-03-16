package selbstlernen.abstract_Class_Interface;

public class C_AvciKuslar extends B_Kuslar{

    public void hareket (){System.out.println("ucarlar");}
    public void beslenme (){
        System.out.println("et yerler");
    }
    public void pence (){System.out.println("pencelidirler");}
    public void gaga (){System.out.println("sivri gagali");} // bu override

    @Override
    public void omur() { // Code kisminda implement method kismina basinca bu method buraya olusur
        System.out.println("Avci Kuslar 10 yil yasar");
    }

    public static void main(String[] args) {
        // sadece bu class'tan obje olusturuyorum.digerlerinden degil.
        // diger iki classta obje olmayacagi icin onlari abstract yapiyoruz

        C_AvciKuslar kartal = new C_AvciKuslar();
        C_AvciKuslar sahin = new C_AvciKuslar();

        // B_Kuslar kus = new B_Kuslar(); digerleri abstract class oldugu icin obje olusturamayiz

        A_Hayvan baykus = new C_AvciKuslar();
        baykus.hareket(); // aramaya hayvanlar class'indan baslar--- ucarlar
        baykus.solunum(); //
        baykus.omur(); // omur methodu var ama body'si yoktu. mutlaka body'Si olmak zorunda yoksa hata verir
        // biz code kisminda implement yapiyoruz ve 13. satira geliyor bu method

    }
}
