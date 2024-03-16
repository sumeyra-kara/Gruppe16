package tage.tag52;

public class C01_Static {

    public static String x = "Xxxx";

    public String y = "Yyyy";

    static {
        System.out.println("Static-1 blok çalıştı");
    }

    static {
        System.out.println("Static-2 blok çalıştı");
    }

    {
        System.out.println("Instance blok çalıştı");
    }

    public C01_Static(){
        System.out.println("Constructor çalıştı");
    }

    public static void printStatic(){
        System.out.println("Statik Metod çalıştı");
    }
    public void printInstance(){
        System.out.println("Instance Metod çalıştı");
    }
}
