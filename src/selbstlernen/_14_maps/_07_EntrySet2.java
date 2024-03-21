package selbstlernen._14_maps;

import java.util.Map;

public class _07_EntrySet2 {

    // verilen okulMap'indeki soyisimleri buyuk harfe cevir

    public static void main(String[] args) {

        Map<Integer,String> okulMap = _03_MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        _03_MapMethodDepo.soyIsimleriBuyukYap(okulMap);
        System.out.println(okulMap);

    }
}
