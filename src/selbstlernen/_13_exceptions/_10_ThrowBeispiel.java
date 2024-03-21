package selbstlernen._13_exceptions;

public class _10_ThrowBeispiel {

    public static void main(String[] args) {

        int a =10;
        int b= 2;


        try {
            System.out.println(a/b);
        try {
            Object c = a/b; // 5
            String d = (String) c; // ClassCastException
        }catch (ClassCastException e){ // ClassCastException bunu buldu
            throw new RuntimeException(e); // sonra RuntimeException'e git diyor
        }

        } catch (RuntimeException e) { // gidiyor
            System.out.println("throw keyword"); // ve bunu yazdiriyor
        }
    }
}
