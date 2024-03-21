package selbstlernen._14_maps;

import java.util.Map;
import java.util.TreeMap;

public class _10_HashMapMethodlari {

    public static void main(String[] args) {

        Map<String , Integer> ornekMap = new TreeMap<>();
        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}
        // get : verilen key varsa valuesunu dondurur yoksa null dondurur
        System.out.println(ornekMap.get("A")); // 20
        System.out.println(ornekMap.get("Z")); // null

        System.out.println(ornekMap.getOrDefault("M", 60));  // 20
        // getOrDefault : M( verilen key) varsa degerini yazdirir, yoksa 60(default-yeni deger) olarak yazdirir

        System.out.println(ornekMap.getOrDefault("Z", 60));  // 60
        // Z olmadigi icin valuesi 60 oluyor

        System.out.println(ornekMap.containsKey("T")); // true
        System.out.println(ornekMap.containsKey("L")); // false

        // replace: Verilen key varsa degerini update eder ve eski degerini dondurur.
        System.out.println(ornekMap.replace("M", 50));//20 ---M'nin eski valuesìni yazdirir. ama siliyor eski degerini
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=30} -- sonra yani dgeri ile yazdiriyor


        System.out.println(ornekMap.replace("T", 30, 90)); // true
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90} -- eski degeri silip yeni degeri ile yazdirir

        System.out.println(ornekMap.replace("B", 30, 90)); // false - false olunca degisiklik yapmaz
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90} --- ayni sekilde kalir

        System.out.println(ornekMap.size()); // 5
        System.out.println(ornekMap.isEmpty()); // false
        // ornekMap.clear();
    }
}
