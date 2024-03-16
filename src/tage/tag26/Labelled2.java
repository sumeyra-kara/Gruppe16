package tage.tag26;

public class Labelled2 {
    public static void main(String[] args) {
        int i=0;

        outer:
        do{     // äußere loop
            i=8;
            inner:
            while(true)  // innere loop
            {
                System.out.println(i--); // 8 ...... 5
                if(i==4)
                {
                    break outer;
                }
            }
        }while(true);

    }

}
