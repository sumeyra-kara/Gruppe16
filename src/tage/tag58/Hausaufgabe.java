package tage.tag58;

public class Hausaufgabe {

    private static int student_id=123;

    private static String student_name="Ema Kahn";

    private static int grades=70;


    public static String getStudent_name(){
         return student_name;
    }

    public static int getGrades(){
        return grades;
    }

    public static int getStudent_id (){
        return student_id;
    }

    public static void setStudent_id(int student_id) {
        Hausaufgabe.student_id = student_id;
    }

    public static void setStudent_name(String student_name) {
        Hausaufgabe.student_name = student_name;
    }

    public static void setGrades(int grades) {
        Hausaufgabe.grades = grades;
    }

    public static int addGrade(){
       return grades+=10;
    }

    public static void main(String[] args) {

        System.out.println("student_id = " + student_id); // 123
        setStudent_id(1500);
        System.out.println("getStudent_id() = " + getStudent_id());


        System.out.println("getGrades() = " + getGrades()); // 70
        setGrades(80);
        System.out.println("getGrades() = " + getGrades());

        System.out.println("addGrade() = " + addGrade());



        System.out.println("student_name = " + student_name);// Ema Kahn
        System.out.println("getStudent_name() = " + getStudent_name());
        setStudent_name("Frauke Zweck");
        System.out.println("student_name = " + student_name);


    }


}
