package tage.tag65;

public interface GeneralAttributes {
    String city = "Berlin";
    String country = "Germany";

    void print(); //abstract method

    public static void printNonAbstract(){
        System.out.println("non abstract print");
    }
}
