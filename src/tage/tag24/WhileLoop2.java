package tage.tag24;

public class WhileLoop2 {
    public static void main(String[] args) {

        int counter = 0;

        /* while (counter<100){ // sonsuz olur cunku 0 her zaman 100 den kucuk ve sonsuza kadar gider
            System.out.println(counter);
        }
        */

        // i++ 'nin nerede oldugu onemli.sout tan önce veya sonra olursa degisir sonuc

        int i=0;
        while (i <100){

            System.out.println(i);
            i++;
        }
        System.out.println("son " + i);


    }
}
