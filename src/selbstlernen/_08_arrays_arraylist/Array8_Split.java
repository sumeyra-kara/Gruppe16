package selbstlernen._08_arrays_arraylist;

import java.util.Arrays;

public class Array8_Split {

    public static void main(String[] args) {
        // paracalara ayirir, string döndurur

        String str = "Java git gide guzellesiyor";

        // mesela e harfinden parcalayalim
        str.split("e");
        System.out.println(Arrays.toString(str.split("e"))); // [Java git gid,  guz, ll, siyor]


        str.split(" ");
        System.out.println(Arrays.toString(str.split(" "))); // [Java, git, gide, guzellesiyor]

        str.split(""); // hiclik olarak ayiralim
        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , g, i, t,  , g, i, d, e,  , g, u, z, e, l, l, e, s, i, y, o, r]

        // SORU : bir stringte istenen karakterin kac defa kullanildigini yazdirin
        String str2 = "Java guzeldir";

        String arananKarakter = "a";
        String [] karakterler = str2.split("");
        int sayac=0;

        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(arananKarakter)){
                sayac++;
            }
        }
        System.out.println(arananKarakter +" "+ sayac + " kez kullanilmis");

    }
}
