package tage.tag35;

import java.util.Scanner;

public class WählenTest {
    public static void main(String[] args) {

        for(int i=0; i<5; i++)
        {
            System.out.println("Prüfe ob jemand berechtigt ist zu wählen:");
            prüfeObWahlBerechtigt();
        }

    }


    public static void prüfeObWahlBerechtigt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gibt das Alter ein:");
        int alter = sc.nextInt();

        if(alter >= 18)
        {
            System.out.println("Berechtigt zu wählen");
        }
        else
        {
            System.out.println("Nicht berechtigt zu wählen");
        }
    }
}
