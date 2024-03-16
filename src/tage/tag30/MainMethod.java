package tage.tag30;

public class MainMethod {
    public static void main(String[] args) {

        System.out.println("we are in the real main method");

        main();
        main("text text text");
        main("text", "text");

    }

    public static void main(){
        System.out.println("      fake main method");
    }

    public static void main(String text){
        System.out.println("      fake main method " + text);
    }

    public static void main(String text, String text2){
        System.out.println("      fake main method " + text + " " + text2);
    }



}
