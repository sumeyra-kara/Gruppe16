package selbstlernen._13_exceptions;

public class _09_Throw_2 {

    public static void main(String[] args) {

        // throw hangi hatayi buldugumuzda ne yapacagimiza karar verir

        String a = null;
        String b = "";

        try {
        try {
            int c = a.length() + b.length(); // NullPointerException
            // System.out.println("Merhaba"); --hata buldugu icin artik bu ve sonrakileri yazdirmaz

        } catch (NullPointerException e) { // buraya geliyor exception burada
            if (b.length()==0){
                throw new RuntimeException(); // dogru ise runtimeException a git diyor
            }

            System.out.println("Null point vardir.Islem yapilamaz");

        }
        } catch (RuntimeException e){
            System.out.println("Throw keyword calisti");
        }




    }
}
