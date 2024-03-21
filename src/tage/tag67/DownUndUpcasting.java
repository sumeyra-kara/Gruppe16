package tage.tag67;

public class DownUndUpcasting {
    public static void main(String[] args) {

        Parent p = new Child(); //Upcasting
        p.name = "nameXY";

        System.out.println(p.name); // Name kommt aus Parent class, weil REFERENZ
        p.method();     // methode wurde überschrieben, kommt aus CHILD klasse

        //Child c = new Parent(); // Downcasting funktioniert nicht

        Child c = (Child)p; // Downcasting (explizit)

        c.id = 1; // child
        c.name = "aasdasd"; // parent



    }
}
