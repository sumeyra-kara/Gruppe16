package selbstlernen.metotlar;

public class StringMethodlari {
    public static void main(String[] args) {

        String str = "Java cok kolay yeter ki sevelim";
        str.toLowerCase(); // metni kücük harf yapar ama göremem.cunku yazdirmadik veya atama yapmadik.bosa calismis olur
        // atama yapariz ya da yazdirmaliyiz

        ReturnType_MethodOlusturma.ismiIstenenFormataCevir("asli", "karabiber");


        System.out.println(ReturnType_MethodOlusturma.ismiIstenenFormataCevir("kemal", "yanci"));
        // bu sekilde return olursa sout yaparriz. void yaparsak konsolda bir sey goremem.
        // ama void ise sout yapmaya gerek kalmaz. o sekilde de yazar




        // ikisi arasindaki fark ustteki java alttakini biz yaptik
        //ikisi de string döndurur


        // bize bir sey döndüren metotlari ya uygun bir variable ye atamaliyiz veya direkt olarak yazdirmaliyiz
        //aksi takdirde method calisir bize sonucu döndürür yani-- getirir ama kullanmadigimiz icin havaya ucar


    }
}
