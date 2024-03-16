package tage.tag26;

public class Continue {

    public static void main(String[] args) {

        int nummer;
        for (nummer = 1; nummer <= 15 ; nummer++) {
            // System.out.println(nummer);
            if (nummer == 13) {
                continue;
            }
            // Ausgabe der Zeile 14 fur alle cases auser nummer ==13:
            System.out.println(nummer);
        }



        System.out.println("---");
        int balance=10;
        while (true){
            if (balance<9)
                break;
            balance= balance-9;

        }
        System.out.println(balance);

        }
    }

