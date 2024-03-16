package tage.tag39;

public class Contains {


    //Method

    public static void main(String[] args) {
        String tasche = "Handy, Computer, Kopfhörer, Stift";

        System.out.println("tasche.contains(\"Handy\") = " + tasche.contains("Handy"));
        System.out.println("tasche.contains(\"laptop\") = " + tasche.contains("laptop"));
        System.out.println("tasche.contains(\"H\") = " + tasche.contains("H"));
        System.out.println("tasche.contains(\"h\") = " + tasche.contains("h"));

        //Beispiel
        String search = "Glass";
        boolean gibtEs = tasche.contains(search);

        //False
        if(gibtEs){
            System.out.println("Ja, es gibt "+ search);
        }else{
            System.out.println("Nein, es gibt keine " + search);
        }

        //Beispiel
        String name = "Hans?-";
        String special = "!?+-";

        for (int i = 0; i < special.length() ; i++) {
            boolean result = name.contains(special.charAt(i)+"");
            if(result){
                System.out.println("Im " + name + " gibt es Sonderzeichen: "+ special.charAt(i));
            }
        }

        //Hausaufgabe
        //new Input vom Benutzer name, special
        //Schreiben Sie ein Method specialCheck(name, special)

    }
}
