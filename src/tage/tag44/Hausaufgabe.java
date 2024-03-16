package tage.tag44;

public class Hausaufgabe {
    public static void main(String[] args) {

        String str = "(((W&i**_l7l3k%%om?&m!@$en,, <i+#n§ co>re <J>>>$@av``~a777.||}{";

       //StringBuilder m = new StringBuilder("(((W&i**_l7l3k%%om?&m!@$en,, <i+#n§ co>re <J>>>$@av``~a777.||}{");
        //System.out.println(m.charAt(0));


        System.out.println(str.replaceAll("[^a-zA-Z\\s]",""));




    }
}
