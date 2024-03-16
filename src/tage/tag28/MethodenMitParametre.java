package tage.tag28;

public class MethodenMitParametre {


    public static void main(String[] args) {
        //printMustafa();
        // printFigen();
        printName("sümeyra");
        printName("figen");

        printNumber(1040);

        String nameMustafa = "Mustafa";
        System.out.println(nameMustafa);


    }

    public static void printName (String name) {
        System.out.println("Hi, " + name);
    }

    public static void printNumber (int number) {
        System.out.println(number);
    }



    /*
    public static void printMustafa () { // statisch ama dinamik olmali--ustteki örnek gibi
        System.out.println("mustafa");
    }
    public static void printFigen () { // statisch dinamik olmali
        System.out.println("figen");
    }

     */





}
