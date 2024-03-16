package selbstlernen.polimorphism;

import java.util.ArrayList;

public class O_Test_Kisi_Ogrenci_Ogretmen {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Huseyin","kaya",1990,"213313",null);
        //Kisi kisi1=new Ogrenci("Huseyin","kaya",1990,"213313",null);


        Ogretmen ogretmen = new Ogretmen("Osman","Garip",1969,"Mat");
        //Kisi kisi2 =new Ogretmen("Osman","Garip",1969,"Mat");





        ArrayList<Kisi> kisiler =new ArrayList<>();
        kisiler.add(ogrenci);
        kisiler.add(ogretmen);

        

        kisiBilgileriGoster(ogretmen);
        System.out.println(" ");
        kisiBilgileriGoster(ogrenci);
        System.out.println("***********");
        ogrenciBilgileriGoster(ogrenci);
        System.out.println(" ");
        ogretmenBilgileriGoster(ogretmen);
        System.out.println("*****************");


        //INSTANCEOF KONUSU
        hesapla(ogrenci);
        hesapla(ogretmen);



    }

    public static void kisiBilgileriGoster(Kisi kisi){
        System.out.println("Ad : "+ kisi.getIsim());
        System.out.println("Soyad : "+ kisi.getSoyIsim());
        System.out.println("Dogum yili : "+ kisi.getDogumYili());

    }

    public static void ogrenciBilgileriGoster(Ogrenci ogrenci){
        System.out.println("Ad : "+ ogrenci.getIsim());
        System.out.println("Soyad : "+ ogrenci.getSoyIsim());
        System.out.println("Dogum yili : "+ ogrenci.getDogumYili());
        System.out.println("Okul numarasi : "+ ogrenci.getOkulNumarasi());
        System.out.println("Dersler : "+ ogrenci.getDersler());
    }

    public static void ogretmenBilgileriGoster(Ogretmen ogretmen){
        System.out.println("Ad : "+ ogretmen.getIsim());
        System.out.println("Soyad : "+ ogretmen.getSoyIsim());
        System.out.println("Dogum yili : "+ ogretmen.getDogumYili());
        System.out.println("'''''''");

        System.out.println(ogretmen);


    }

    // INSTANCEOF KONUSU
    public static void hesapla (Kisi kisi){ // ogrenci ise sadece adini ogretmen ise hem ad hem soyad hesaplasin istersek


        if(kisi instanceof Ogrenci){ // eger kisi ogrenci ise burasi calisir
            System.out.println("Ogrenci adi : "+kisi.getIsim());

        }else if(kisi instanceof Ogretmen){ // eger kisi Ogretmen ise

            System.out.println("Ogretmen adi : "+ kisi.getIsim());
            System.out.println("Ogretmen soyadi : "+ kisi.getSoyIsim());
        }
    }



}
