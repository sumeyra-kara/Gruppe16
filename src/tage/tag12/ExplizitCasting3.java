package tage.tag12;

public class ExplizitCasting3 {

    public static void main(String[] args) {


    double dValue = 10;
    int iValue = (int) dValue;

    System.out.println("iValue : " + iValue);

    dValue = 11.3;
    iValue = (int) dValue;

    System.out.println("iValue : " + iValue);

    dValue = 11.9;
    iValue = (int) dValue;

    System.out.println("iValue : " + iValue);



    }
}
