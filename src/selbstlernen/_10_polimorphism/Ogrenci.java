package selbstlernen._10_polimorphism;

import java.util.ArrayList;

public class Ogrenci extends Kisi{
    private String okulNumarasi;

    private ArrayList<String> dersler;

    public Ogrenci(){

    }



    public Ogrenci(String isim,String soyIsim, int dogumYili){
        super(isim,soyIsim,dogumYili);
    }

    public Ogrenci(String isim, String soyIsim, int dogumYili, String okulNumarasi, ArrayList<String> dersler) {
        super(isim, soyIsim, dogumYili);
        this.okulNumarasi = okulNumarasi;
        this.dersler = dersler;
    }


    public String getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(String okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }


    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<String> dersler) {
        this.dersler = dersler;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNumarasi='" + okulNumarasi + '\'' +
                ", dersler=" + dersler + ", Isim : " + getIsim()
                + ", Soyisim : "+getSoyIsim()+"., DogumYili"+getDogumYili()+
                '}';
    }
}
