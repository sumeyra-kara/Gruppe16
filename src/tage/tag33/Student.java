package tage.tag33;

public class Student {

    // static int temp; //globale variablen
    int nummer;
    String name;

    public void printStudentInfo (){ // instanzmethode

        System.out.println("Name : " + name);
        System.out.println("Nummer : " + nummer);
    }

    public static void main(String[] args) {
        Student student1 = new Student (); // objekt, nesne -- klassenname name= new Klassenname

        student1.name = "Sümeyra";
        student1.nummer = 120;

        Student student2 = new Student(); // ikinci objekt
        student2.name = "Ersin";
        student2.nummer = 130;

        System.out.println(student1.name);
        System.out.println(student1.nummer);

        System.out.println(student2.name);
        System.out.println(student2.nummer);

        new Student(); // objekt erstellt ohne Referenz

        Student studentxyz; // referenz ohne Objekt

        Student student3; // referenz ohne Objekt

        student3 = student1;
        System.out.println(student3.name);

        student3 = new Student();
        System.out.println(student3.name);

        Student student4 = new Student(); // defalt degerini null verir
        System.out.println(student4.name);
        System.out.println(student4.nummer);

        student3.name = "Mustafa";
        student3.nummer = 140;
        System.out.println(student3.name);

        student4.name ="Figen";
        student4.nummer= 150;

        System.out.println(student4.name);

        student1.printStudentInfo();




    }

}
