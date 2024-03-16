package tage.tag44;

public class WrapperKlassen {

    public static void main(String[] args) {

        // Primitive Datentyp

        int i  =5;
        double b = 2.3;
        short c = 10;
        float d = 2.455f;

        String nummer = "2024";
        String nummer2 = "20.24";
        String nummer3 = "eren";


        System.out.println(nummer);


        int numm = Integer.parseInt(nummer);
        System.out.println(numm);


        System.out.println(Integer.parseInt(nummer));
        System.out.println(Double.valueOf(nummer2));

        System.out.println(Integer.valueOf(nummer));
        System.out.println(Double.parseDouble(nummer2));

        System.out.println(String.valueOf(i));
        System.out.println(Character.toUpperCase(nummer3.charAt(2)));

    }
}
