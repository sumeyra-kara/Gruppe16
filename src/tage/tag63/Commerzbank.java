package tage.tag63;

public class Commerzbank extends Bank {

    public Commerzbank(String accountType, double currentBalance) {
        super(currentBalance + 120, accountType.toUpperCase(), "Commerzbank");

        switch (super.getAccountType()){
            case "GOLD":
                setDepositBonus(80);
                setWithdrawlExpense(70);
                setReturnRate(1.3);
                break;
            case "SAVING":
                setDepositBonus(90);
                setWithdrawlExpense(60);
                setReturnRate(1.2);
                break;
            case "INTEREST":
                setDepositBonus(100);
                setWithdrawlExpense(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("Ungültige Eingabe!");
        }
    }


    @Override
    public void deposit(double depositValue) {

        if(depositValue < 2000)
        {
            super.deposit(depositValue); // Geld einzahlen
        }
        else
        {
            super.deposit(depositValue + getDepositBonus());
        }
    }

    @Override
    public void withdraw(double withdrawValue) {

        if(withdrawValue < 1000)
        {
            super.withdraw(withdrawValue); // Geld abeheben
        }
        else
        {
            super.withdraw(withdrawValue + getWithdrawlExpense()); // Geld abeheben + Gebühr

        }
    }
}
