package tage.tag63;

public class Bank {
    private String bankName;

    private double currentBalance; // enthält den aktuellen Kontostand
    private double finalBalance; // enthält den Kontostand nachdem das Konto geschlossen wurde

    private String accountType; // Gold, Sparkonto(saving), Zins(interest)

    private double depositBonus;
    private double withdrawlExpense;
    private double returnRate;

    boolean isAccountClosed = true;

    // ***********************
    // ***** CONSTRUCTOR *****
    // ***********************


    public Bank(double currentBalance, String accountType, String bankName){
        this.currentBalance = currentBalance;
        this.accountType = accountType;
        this.bankName = bankName;
        System.out.println("===== Willkommen bei der " + bankName + " ! =====");
        System.out.println("Ihr " + accountType + " - Konto hat einen Wert von: " + currentBalance);
        isAccountClosed = false;
    }

    // ***********************
    // ***** METHODEN    *****
    // ***********************

    public void deposit(double depositValue){ // Geld einbezahlen

        if(depositValue < 0)
        {
            System.out.println("Fehlerhafte Eingabe beim Einzahlen!");
        }
        else {
            currentBalance += depositValue;
            System.out.println("Sie haben " + depositValue + " eingezahlt...");
            System.out.println("Gesamtkontostand beträgt: " + currentBalance);
        }
    }

    public void withdraw(double withdrawValue){ // Geld abheben
        if(withdrawValue < 0)
        {
            System.out.println("Fehlerhafte Eingabe beim Abheben");
        }
        else if(withdrawValue>getCurrentBalance()){
            System.out.println("Abeheben von " + withdrawValue + " nicht möglich, zu wenig Geld auf dem Konto!");
        }
        else
        {
            currentBalance -= withdrawValue;
            System.out.println("Sie haben + " + withdrawValue +  " abgehoben");
            System.out.println("Gesamtkontostand beträgt: " + currentBalance);
        }
    }

    public double closeAccount(){ //Bankkonto schließen

        if(isAccountClosed)
        {
            System.out.println("Das Konto ist bereits geschlossen!!!");
        }
        else {
            System.out.println(" ===== Prozess des Konto schließens startet =====");
            finalBalance = getCurrentBalance() + (getCurrentBalance()*getReturnRate()/100); // Kontostand + Zinsen
            currentBalance = 0;
            System.out.println("Finaler Kontostand: " + finalBalance);
            System.out.println(" ===== KONTO GESCHLOSSEN ===== ");
            isAccountClosed = true;
            accountType = "CLOSED";
        }

        return getFinalBalance();
    }



    // *******************
    // ***** GETTER  *****
    // *******************

    public String getBankName() {
        return bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithdrawlExpense() {
        return withdrawlExpense;
    }

    public double getReturnRate() {
        return returnRate;
    }

    // *******************
    // ***** GETTER *****
    // ******************

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithdrawlExpense(double withdrawlExpense) {
        this.withdrawlExpense = withdrawlExpense;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

}
