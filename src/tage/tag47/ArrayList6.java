package tage.tag47;

import java.util.ArrayList;

public class ArrayList6 {

    public static ArrayList<Integer> geradeZahlen(int start, int ende){

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i=start; i<=ende; i++){
            if (i%2==0){
                evenNumbers.add(i);
            }

        }
        //System.out.println(evenNumbers);
        return  evenNumbers;

    }



    public static void main(String[] args) {

        // wir erstellen eine Liste und wollen alle gerade Zahlen in die Liste schreiben-bis 100

        ArrayList<Integer> geradeZahl = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i=0; i<=100; i++){
             if (i%2==0){
                 geradeZahl.add(i);
             }

        }
        System.out.println(geradeZahl);


        for (int i=0; i<=100; i+=2){

                list2.add(i);

        }
        System.out.println(list2);

        // bu metot icin---dinamik yaptik

        geradeZahl = geradeZahlen(12,56);
        System.out.println(geradeZahl);

        list2 = geradeZahlen(2,20);
        System.out.println(list2);

    }
}
