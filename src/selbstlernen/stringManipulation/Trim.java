package selbstlernen.stringManipulation;

public class Trim {


    public static void main(String[] args) {
        String str = "       Ali      topa      vur.    ";
        // metindeki fazla olan bosluklaru temizleyin

        str = str.trim();

        str = str.replaceAll("\\s+"," "); // regex kuralin agöre coklu spaceleri bir tane space yapar

        System.out.println(str);
    }
}
