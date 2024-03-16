package tage.tag26;

public class Soru {
    public static void main(String[] args) {


        // bu sonsuz olur
        int i = 0;
        int sum = 0;
        while (i<3){
            i++;

            if (i%3==0) continue;
            sum+=i;

        }
        System.out.println(sum);

        sum=0;
        for (i = 0; i <4 ; i++) {
            if (i%3==0) continue;
            sum+=i;
        }
        System.out.println(sum);
    }
}
