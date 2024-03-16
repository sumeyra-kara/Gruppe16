package selbstlernen.abstract_Class_Interface;

public class G_ChildOf01fürInterface3 implements I_Interface_Istisnalar {
    @Override
    public void toplama() {

    }

    public static void main(String[] args) {

        G_ChildOf01fürInterface3 obj = new G_ChildOf01fürInterface3();
        obj.ekIsler(); // keyword'u default olana obje uzerinden ulasilabilir


        I_Interface_Istisnalar.aciklama(); // keywordu static olana ise o ait oldugu Interface adi uzerinden ulasilir

    }
}
