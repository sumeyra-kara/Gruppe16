package tage.tag73;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class PlateGenerator {
    /*
    Methode hat zwei Parameter: 2 Buchstaben der Stadt
                                + Datum der Anmeldung

        methodeXY("AM", "12/01/2026"){

            return StringXY
        }


        Nummernschild besteht aus 2 Buchstaben + 2 Zahlen + 3 Buchstaben
        z.B "AM-72-ZIQ"

        1) 2 Buchstaneb sind frei wählbar
        2) 2 Zahlen werden erstellt 12.03.2013   --> 13
                                    23.05.2015   --> 15
                                    14.06.2022   --> 22
            wenn Auto zwischen März und August zugelassen wurde

            Wenn das Auto zwischen September und Februar zugelassen wurde, dann Jahr + 50
                                    01.01.2010 --> 10 + 50 --> 60
                                    14.12.2022 --> 22 + 50 --> 72
                                    29.11.2015 --> 15 + 50 --> 72

        3) 3 Buchstaben sind Zufallsbuchstaben zwischen I - Q
     */


    public static void main(String[] args) {

        String myNumberPlate = generateNumber("XY", "01/11/2020");
        System.out.println("Generiertes Nummenschild: " + myNumberPlate);
    }

    public static String generateNumber(String cityTag, String dateString){

        String plate = "";
        String dateIdentifier;
        String randomLetters;

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        //String --> Date
        LocalDate date = LocalDate.parse(dateString, format);

        System.out.println("date : " + date);
        System.out.println("Jahr : " + date.getYear());
        System.out.println("Monat: " + date.getMonth());

        int month = date.getMonthValue();
        int year = date.getYear();

        if(month < 3){
            dateIdentifier = String.valueOf(year+49).substring(2);
        } else if (month < 9) {
            dateIdentifier = String.valueOf(year).substring(2);
        }
        else {
            dateIdentifier = String.valueOf(year+50).substring(2);
        }

        //random letters:

        Random random = new Random();

        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        candidateChars.charAt(random.nextInt(candidateChars.length()));

        char randomChar1 = candidateChars.charAt(random.nextInt(candidateChars.length()));
        char randomChar2 = candidateChars.charAt(random.nextInt(candidateChars.length()));
        char randomChar3 = candidateChars.charAt(random.nextInt(candidateChars.length()));

        System.out.println("char1 " + randomChar1);
        System.out.println("char2 " + randomChar2);
        System.out.println("char3 " + randomChar3);

        randomLetters = "" + randomChar1 + randomChar2 + randomChar3;
        System.out.println("randomstring: " + randomLetters);

        plate = "" + cityTag + dateIdentifier + randomLetters;

        return plate;
    }

    public static char generateRandomChar(){
        /*
        char x;

        String candidateChars = "ABCIJKLMNOPQ";
        candidateChars.charAt(random.nextInt(candidateChars.length()));

        return x; */
        return 0;
    }

}
