package tage.tag12;

public class ExplicitCastingBeispiel {

    public static void main(String[] args) {

      double dValue = 10.1;

      int iValue;

      // iValue = (int)(10 + 10.1);     20;

       iValue = (int) 10 + (int) 10.1;

      System.out.println(iValue);


    }
}
