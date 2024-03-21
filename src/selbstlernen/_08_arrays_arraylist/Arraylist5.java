package selbstlernen._08_arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist5 {
    public static void main(String[] args) {
        // ARRAY"den ARRAYLIST yapmak
        // özellikle fazla elementli bir liste olusturmak istersek,tek tek add yapmak zahmetli olacaktir
        //bu yuzden önce array olarak olusturup sonra ArrayList'e cevirmek daha avantajli olur
        // mesela int [] arr = {2,3,5,1,3,5,7,8,4,9,0,5,3,2,5,6,7,8} olsun bunun icin onlarca add yapmak lazim
        // bunun yerine bir bir liste yapip for-each-loop ile tum elementleri bu listeye ekleyebiliriz

        int [] arr = {2,3,5,1,3,5,7,8,4,9,0,5,3,2,5,6,7,8};

        List <Integer> sayilar = new ArrayList<>();


        for (Integer each : arr) {
            sayilar.add(each);
        }
        System.out.println(sayilar);


        // diger konu---Arrays.asList() methodu da Array'den arraylist yapmak icin kulllamilir
        // ama 2 tane dezavantaji var-- cok kullanisli degil bu yuzden
        // 1. bunu array gibi gördugu icin listeye ekleme cikarma yapamiyor
        // ilk basta java problemi gormez ama calistirdiginda exception hatasi cikar
        //2- java array ve arraylist i tek bir yapi gibi görür.birinde yaptigin degisikligini digerinde de yapar

        String[] strArr ={"a","b","c"};
        List<String> harfler = Arrays.asList(strArr);
        System.out.println(harfler);

        strArr[0]="e";
        System.out.println(Arrays.toString(strArr)); // sadece bunu degistirmek istedim
        System.out.println(harfler); // ama burdaki sifirinci indeks de degisti--dezavantaji bu
        System.out.println("***");

        harfler.set(2,"t");
        System.out.println(Arrays.toString(strArr));
        System.out.println(harfler); // aslinda sadece burada degisiklik yaptim ama strArr deki de degisti
    }
}
