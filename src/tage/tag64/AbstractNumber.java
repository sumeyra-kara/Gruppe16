package tage.tag64;

public abstract class AbstractNumber {
    int num;

    AbstractNumber() {

    }

    AbstractNumber(int n){
        this.num = n;
    }

    public abstract void printNumber(); // method "header" or method "signature"

    public void printblabla() {
        System.out.println("nicht abstrakte methode...");
    }
}
