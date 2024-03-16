package tage.tag15;

public class LogischesOder {
    public static void main(String[] args) {

        System.out.println(3>1 || 3>2); // true true --- true
        System.out.println(3>1 || 3>5); // true false ---- true
        System.out.println(3>10 || 3>2); // false true ---- true
        System.out.println(3>10 || 2>3); // false false ------false
    }
}
