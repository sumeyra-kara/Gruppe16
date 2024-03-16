package tage.tag21;

public class UbungIf {

    public static void main(String[] args) {

        String buch ="meine kleine Farm";
        String autor ="";


        switch (buch) {
            case "1984":
            case "meine kleine Farm" :
                autor = "George Orwell";
                break;
            case "factfulness":
                autor = "Hans Rossling";
                break;
            case "Java is auch eine Insel":
                autor = "Christian ULLenboom";
                break;

        }

        System.out.println("der Autor des Buches " + buch + " ist" + autor);





    }
}
