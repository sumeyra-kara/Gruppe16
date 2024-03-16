package tage.tag39;


public class Hausaufgabe1 {

    // String str = "DDEECGDDEEEEFGGDCDDM" ---- "FM"

    public static String findetString (String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            if(!(result.contains(str.charAt(i)+""))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "DDEECGDDEEEEFGGDCDDM";
        // System.out.println(findetString(str));

        System.out.println(findetString(str).substring(4));






    }
}
