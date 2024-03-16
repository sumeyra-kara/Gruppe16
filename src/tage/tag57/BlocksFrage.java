package tage.tag57;

public class BlocksFrage {

    public static void main(String[] args) {
           /*
    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.
    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
    maxBlock("asdf") → 1
    maxBlock("xxxuuuuxux") → 4
         */

        String str ="xxxuuuuxux";
        System.out.println(blocksstr(str));
    }

    public static int blocksstr(String str){
        int max=1;
        int sayac=1;

        if (str.isEmpty()){
            max=0;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(i-1)){
                sayac++;

                if (sayac>max){
                    max = sayac;
                }
            } else {
                sayac=1;
            }
        }
        return max;
    }
}
