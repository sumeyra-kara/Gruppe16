package selbstlernen._14_maps;

import java.util.Map;
import java.util.TreeMap;

public class _9_Compute_2 {

    public static void main(String[] args) {

        Map<String , Integer> ornekMap = new TreeMap<>();
        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}

        // eger Map'de A varsa degerini 40 yap. yoksa bir sey yapma.

        //ornekMap.put("A",40); -- bu varsa degistirir yenisi bu olur. yoksa da bu eklenmis olur

        ornekMap.computeIfPresent("A",(k,v) -> v=40); // eger A varsa value'yi 40 yap demek
        System.out.println(ornekMap); // {A=40, B=15, K=25, M=20, T=30}

        //map'de B yoksa B'ye deger olarak 50 yap onu

        ornekMap.putIfAbsent("B",50); // {A=40, B=15, K=25, M=20, T=30} // eger yoksa 50 ekle
        ornekMap.computeIfAbsent("B", v -> 50 ); // bu ikisi aynidir. eger b yoksa b nin valuesi 50 olsun

        System.out.println(ornekMap); // {A=40, B=15, K=25, M=20, T=30}

        // map'De K varsa degerini 2 katina cikar

        ornekMap.computeIfPresent("K", (a,b) -> b*2); // bu sekilde a ve b seklinde de yazilabilir
        System.out.println(ornekMap); // {A=40, B=15, K=50, M=20, T=30}

        // eger T varsa degerini 10 azalt

        ornekMap.computeIfPresent("T", (k,v) -> v-10);
        System.out.println(ornekMap); // {A=40, B=15, K=50, M=20, T=20}

        // eger C yoksa degeri 30 olarak ekle

        ornekMap.computeIfAbsent("C", v -> 30); // eger C yoksa values'sunu 30 yap
        System.out.println(ornekMap); // {A=40, B=15, C=30, K=50, M=20, T=20}



    }
}
