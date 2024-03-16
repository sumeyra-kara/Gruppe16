package tage.tag63;

public class Consorsbank extends Bank{

    public Consorsbank(String accountType, double currentBalance) {
        super(currentBalance + 100, accountType.toUpperCase(), "Consorsbank");

        switch (super.getAccountType()) {
            case "GOLD":
                setDepositBonus(80);
                setWithdrawlExpense(90);
                setReturnRate(1.4);
                break;
            case "SAVING":
                setDepositBonus(100);
                setWithdrawlExpense(70);
                setReturnRate(1.1);
                break;
            case "INTEREST":
                setDepositBonus(90);
                setWithdrawlExpense(80);
                setReturnRate(1.2);
                break;
            default:
                System.out.println("Ungültige Eingabe!");
        }
    }
}
