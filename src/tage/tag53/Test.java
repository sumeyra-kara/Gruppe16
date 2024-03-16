package tage.tag53;

public class Test {

    
    int testNummer;
    static String testName;

    public Test(){

    }
    public Test(int testNummer){
        this.testNummer = testNummer;
    }

    static{
        System.out.println("\t ***** STATIC BLOCK AUS DER KLASSE TEST ***** ");
        testName = "Static Test Name";
        System.out.println("testName: " + testName);
    }
}
