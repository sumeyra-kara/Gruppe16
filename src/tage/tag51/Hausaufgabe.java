package tage.tag51;

import java.util.Arrays;

public class Hausaufgabe {
    public static void main(String[] args) {


        int [] umdrhn = {10,22,25,67};
        int [] neuUmdrhn = new int[umdrhn.length];

        String [] umdrhn2 = {"Sümeyra","Figen","Mustafa","Ersin","Dominik"};
        String [] neuUmdrhn2 = new String[umdrhn2.length];



        for (int i = umdrhn.length-1; i >=0 ; i--) {
           neuUmdrhn[(umdrhn.length-1)-i]=umdrhn[i];
        }
        System.out.println(Arrays.toString(neuUmdrhn));



        for (int i = umdrhn2.length-1; i >=0 ; i--) {
            neuUmdrhn2[(umdrhn2.length-1)-i]=umdrhn2[i];
        }
        System.out.println(Arrays.toString(neuUmdrhn2));


    }







}
