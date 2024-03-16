package selbstlernen.arrays_arraylist;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        // array olusturulurken,1-elementlerin data turu 2- kac element olacagi--bu ikisi önemlidir
        int [] arr = new int[5];  // mesela 5 elemanli bir array
        System.out.println(arr[0]); // henuz daha deger atamadigim icin default degerini 0 i alirim
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0] bütün degerler default degeridir
        arr[0]=6; // bazi elemanlara deger atadik
        arr[2]=7;
        arr[4]=8;
        System.out.println(Arrays.toString(arr)); //[6, 0, 7, 0, 8]- deger atamadiklarimiz default degeri olarak kalir

        // indeks 0 dan baslar

        int [] arr2 = {3,4,5};
        // array icindeki aray'e bu  sekilde indeks ile ulasabiliriz

        System.out.println(arr2[0]); // 3
        System.out.println(arr2[1]); // 4
        System.out.println(arr2[2]); // 5
        // array'in icindeki 4, 8 olsun istersek

        arr2[1]=8; // bu sekilde istedigimiz sayiyi atayarak degisiklik yapabiliriz
        System.out.println(arr2[1]); // artik 8 oldu

        //System.out.println(arr2[5]); 5 elemanli olmadigi icin bunu sorgularsak hata aliriz
        System.out.println("***********");

        int [] arr3 = {2,3,4,56,3,5,74,3,24,34,2,4,6,8};

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("+++++++");

        System.out.println(arr3); // eger array direkt yazdirilirsa referans degerini yazdirir

        System.out.println(Arrays.toString(arr3)); // Arrays.toString methodu ile hepsini yazdirabiliriz
        // [2, 3, 4, 56, 3, 5, 74, 3, 24, 34, 2, 4, 6, 8] java koseli parantez yapar ve sayilar arasi virgul bosluk koyar

        // array'in tum elementlerini for loop ile,
        // arrayi ise direkt yazdirmak istersek Arrays.toString methodu ike yazdirirz


        System.out.println(arr3.length); // array'in uzunlugu--14
        //Array'in uzunlugu degistirilemez. ancak yeni bir array yapariz bastan elemanlarini olusruruz.zor is
    }
}
