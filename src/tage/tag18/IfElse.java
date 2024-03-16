package tage.tag18;

public class IfElse {
    public static void main(String[] args) {

        int punktZahl = 70;
        String note = "";


        if (punktZahl<0 || punktZahl>100) {
            System.out.println("fehlerhafte eingabe");
        } else if (punktZahl>=90) {
            System.out.println("Note ist A");
        } else if (punktZahl>=81) {
            note = "Note B";
        } else if (punktZahl>=69) {
            note = "Note C";
        } else if (punktZahl>=41) {
            System.out.println("Note ist D");
        } else if (punktZahl<=40){
            System.out.println("Notunuz F");
        }

         System.out.println("meine Note ist " + note);
    }

}