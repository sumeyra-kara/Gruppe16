package selbstlernen._06_stringManipulation;

public class IsEmpty_isBlank {
    public static void main(String[] args) {

        // bos mu degil mi

        String str1 ="";
        String str2 ="      ";
        String str3 ="a b";

        System.out.println(str1.isEmpty()); // str1 bos mu,evet bos deger yok hiclik--true
        System.out.println(str2.isEmpty()); // str2 bos mu hayir--FALSE-cunku bosluk(space) var bosluk degil.hiclik degil
        System.out.println(str3.isEmpty()); // str3 bos mu hayir icinde bir seyler var  --false

        System.out.println(str1.isBlank()); // bosluk mu? yok aslinda ama true. hiclik ve space ikisini de bos kabul ediyor
        System.out.println(str2.isBlank()); // ayni sekilde yine. space var ama bosluk kabul ediyor --true
        System.out.println(str3.isBlank()); // false

        // isEmptty sadece hiclige true donuyor,ama isBlank hem hiclige hem de space de true doner.tek fark bu.
    }
}
