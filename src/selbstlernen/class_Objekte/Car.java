package selbstlernen.class_Objekte;

public class Car {

    //arabalarla ilgili özellikleri (fields) ve metodları (işlemleri) oluşturalım

    public String marka; // variableler, degiskenler
    public String model;
    public String renk;
    public int yas;
    public boolean elektrikliMi;

    public void calistir(){
        System.out.println(marka+" çalıştı..");
    } // metotlar yazabilirim
    public void hizlan(){
        System.out.println(marka+ " hizlandi.."+yas+" yaşındaki bir araba için güzel hızlanıyor");
    }

    public void dur(){
        System.out.println(marka+" "+model+ " durdu..");
    }
}
