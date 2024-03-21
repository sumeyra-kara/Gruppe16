package tage.tag66;

public class Addition {
    public static void main(String[] args) {


        Addition add1 = new Addition();
        add1.add(10, 20);
        add1.add(10, 20, 20);
        add1.add(10, 202);
        add1.add(10, 20, 100);

        new Addition().add(200,600, 200); // objekt ohne referenz

    }

    public int add(int a, int b){ // overloading / überladen
        System.out.println(a + b);
        int c = a + b;
        return c;
    }

    public int add(int a, int b, int c){
        System.out.println(a + b + c);
        int d = a + b + c;
        return d;
    }
}
