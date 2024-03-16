package tage.tag15;

public class LogischeOperatorenUnd {
    public static void main(String[] args) {

        System.out.println(3>2);
        System.out.println(5>3);
        System.out.println((3>2)&&(5>3)); // true true ---- true
        System.out.println(3>2 && 3>5);  // true   false ----false
        System.out.println(2>3 && 3>5);  // false false ----- false
        System.out.println(2>3 && 3<5);  // false true ----- false




    }
}
