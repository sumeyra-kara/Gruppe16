package selbstlernen.polimorphism;

public class Kisi {

    private String isim;
    private String soyIsim;
    private int dogumYili;

    public Kisi(){

    }

    public Kisi(String isim, String soIsim, int dogumYili) {

        this.isim = isim;
        this.soyIsim = soIsim;
        this.dogumYili = dogumYili;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", soIsim='" + soyIsim + '\'' +
                ", dogumYili=" + dogumYili +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soIsim) {
        this.soyIsim = soIsim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }
}
