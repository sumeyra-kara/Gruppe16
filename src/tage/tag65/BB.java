package tage.tag65;

public interface BB {

    int number = 1; // public,  static, final            --> im interface
    // default, non-static, non-final   --> in "normaler" klasse
    String city = "München";

    void printB(); //abstract method

    static void writeB(){
        System.out.println("Writing BB....");
        // body
        //.. non-abstract body
    }
}
