package tage.tag17;

public class Wiederholung_Unary {
    public static void main(String[] args) {

        int nummer = 10 + 1;
        System.out.println(nummer); // 11

        System.out.println(nummer++); // önce atiyoruz ayni kaliyor ---11
        System.out.println(nummer); // sonra arttiriyoruz----12
        System.out.println(++nummer); // 1 arttiriyoruz ve atiyoruz ----13

        nummer =1;

        int nummer2 = nummer + nummer++ * --nummer / nummer;
                 //     1    +   1(sonra2)   *  (2-1)   / 1
        System.out.println(nummer2);




    }
}
