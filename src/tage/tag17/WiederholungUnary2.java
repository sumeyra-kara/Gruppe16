package tage.tag17;

public class WiederholungUnary2 {
    public static void main(String[] args) {
        int nummer = 10;


        int nummer2 = nummer / (nummer++ + --nummer) - (nummer - nummer++) * ++nummer;
        //                   / 10+10                  -  10-10
        //               nummer /20                   -  0 * ++nummer
        //                 11/20                       -  0* 12
        //                0                            -  0
        System.out.println(nummer2);

    }
}
