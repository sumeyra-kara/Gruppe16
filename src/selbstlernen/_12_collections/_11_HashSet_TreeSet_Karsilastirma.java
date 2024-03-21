package selbstlernen._12_collections;

import java.util.*;

public class _11_HashSet_TreeSet_Karsilastirma {
    /*
    Bir hashSet ve treeSet olusturalim. Bir Loop iile iclrine 150000 elean ekleyelim.
    Islem surelerini karsilastiralim.
     */
    public static void main(String[] args) {

        Random rndm  = new Random();
        int sayi;
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Long hashStart =  System.currentTimeMillis();

        for (int i = 0; i < 150000; i++) {
            sayi = rndm.nextInt(1250000);
            hashSet.add(sayi);
        }
        Long hashFinish =  System.currentTimeMillis();
        Long treeStart =  System.currentTimeMillis();

        for (int i = 0; i < 150000; i++) {
            sayi = rndm.nextInt(1250000);
            treeSet.add(sayi);

        }
        Long treeFinish = System.currentTimeMillis();
        System.out.println("Hash islem suresi : " + (hashFinish-hashStart)); // Hash islem suresi : 51
        System.out.println("Tree islem suresi : " + (treeFinish-treeStart)); // Tree islem suresi : 112

        // Bu sebeple Hash Tree'Den daha hizlidir diyebiliriz
        System.out.println("*********+");







    }




}
