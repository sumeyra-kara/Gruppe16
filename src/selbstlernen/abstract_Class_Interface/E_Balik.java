package selbstlernen.abstract_Class_Interface;

public abstract class E_Balik extends A_Hayvan{

    public void hareket(){
        System.out.println("baliklar yuzer");
    }

    public void solunum(){
        System.out.println("baliklar solungac solunumu yaparlar");
    }

    public void cogalma(){
        System.out.println("baliklar yumurta ile cogalir");
    }

    public abstract void yuzgec (); // bunun abstract olmayan child classta bodyli methodu olmak zorunda
    public abstract void yasamAlani ();// bunun abstract olmayan child classta bodyli methodu olmak zorunda
    public abstract void iskeletYapisi ();// bunun abstract olmayan child classta bodyli methodu olmak zorunda


}
