package tage.tag39;

public class StringRemoveDuplicate {

    public static String removeDuplicate(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            if(!result.contains(str.charAt(i)+"")){
                result += str.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String myStr = "DDEECGDDEEEEFGGDCDD";
        String myStr2 = "AAAASSDFFRTTTZUKLLMMMHF";

        System.out.println(removeDuplicate(myStr));
        System.out.println("removeDuplicate(myStr2) = " + removeDuplicate(myStr2));
    }
}
