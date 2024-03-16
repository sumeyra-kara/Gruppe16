package selbstlernen.arrays_arraylist;

public class Array4_enkisaEnUzunOrnek {
    public static void main(String[] args) {

        String [] isimler = {"Sedat","Kenan","Mustafa","Gül","Ramazan","Eren"};
        uzunKisaYazdir(isimler);

    }
    // verilen String bir Array'deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void uzunKisaYazdir (String [] isimler){

        String enUzunKelime = isimler[0]; // öyllesine ilk degeri verdim mesela
        String enKisaKelime = isimler[0]; // öyllesine ilk degeri verdim mesela

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }

            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }
        }

        System.out.println(enUzunKelime);
        System.out.println(enKisaKelime);

        // ayni uzunlukta kelimeler varsa ilk gördugunu yazdirir

    }

}
