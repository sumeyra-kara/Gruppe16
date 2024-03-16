package tage.tag44;

public class Hausaufgabe2 {

    public static void main(String[] args) {

        String str = "(((W&i**_l7l3k%%om?&m!@$en,, <i+#n§ co>re <J>>>$@av``~a777.||}{";

        String text = nurText(str);
        System.out.println(text);

    }
    public static String nurText (String str){

        StringBuilder text = new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch)){
                text.append(ch);
            }
        }

        return text.toString();

    }
}
