package tage.tag12;

public class Tasken {
    public static void main(String[] args) {

        int pies = 10, people =4;
        double piesPerson;

        //Task1
        piesPerson = pies/people;
        System.out.println(piesPerson);

        // Task2
        piesPerson =(double) pies/people;
        System.out.println(piesPerson);

        //Task3;
        piesPerson = pies / (double)people;
        System.out.println(piesPerson);

        //Task4
        piesPerson = (double) (pies/people);
        System.out.println(piesPerson);

    }
}
