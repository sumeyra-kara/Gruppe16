package tage.tag63;

public class TestBank {

    public static void main(String[] args) {

        Consorsbank goldKonto1 = new Consorsbank("GOLD", 5000); // String accountType, double currentBalance

        goldKonto1.deposit(3000);
        goldKonto1.deposit(1000);


        goldKonto1.withdraw(200);
        goldKonto1.withdraw(2000);

        //goldKonto1.withdraw(7000);

        goldKonto1.closeAccount();

        System.out.println("*********");

        // KONTO erstellen für andere Accounts

        Commerzbank sparKonto1 = new Commerzbank("SAVING", 10000);
        sparKonto1.deposit(3000);
        sparKonto1.withdraw(500);
        sparKonto1.closeAccount();



    }
}
