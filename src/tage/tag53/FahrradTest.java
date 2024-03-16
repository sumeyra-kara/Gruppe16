package tage.tag53;

public class FahrradTest {
    public static void main(String[] args) {

        Fahrrad fahrrad1 = new Fahrrad();
        Fahrrad fahrrad2 = new Fahrrad(20, 3);

        System.out.println("Anazhl der Fahrräder: " + Fahrrad.getAnzahlFahrräder());

        Fahrrad fahrrad3 = new Fahrrad();
        System.out.println("Anazhl der Fahrräder: " + Fahrrad.getAnzahlFahrräder());

        System.out.println("Fahrrad 1 ID: " + fahrrad1.getId());
        System.out.println("Fahrrad 2 ID : " + fahrrad2.getId());
        System.out.println("Fahrrad 3 ID : " + fahrrad3.getId());



    }
}
