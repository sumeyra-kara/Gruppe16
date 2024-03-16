package selbstlernen.inheritance;

public class AccessModifier_Child extends AccessModifier_Parent {


    static int sayiChildStatic;

    public static void main(String[] args) {

        // inheritance'da private class uyeleri inherit edilemez.erisilemez.
        //

        AccessModifier_Child child = new AccessModifier_Child();
        System.out.println(child.sayiDefault); // 0
        System.out.println(child.sayiProtected); // 0
        System.out.println(child.sayiPublic); // 0

        //icinde bulundugumuz class'taki static variable'lar obje uzerinden otomatik gelmez ama manuel yasinca java kabul eder
        System.out.println(child.sayiChildStatic); // bu ben yazarken cikmaz ama elle yazdiktan sonra cikar

        // ancak parent class'taki static variableler obje uzerinden kulanilamaz
        //child.sayiStaticPrivate;
        // class ismi uzerinden kullanilabilir tabiki ama o zaman bu konu ile alakasi olamaz0
        System.out.println(AccessModifier_Parent.sayiStaticProtected); // bu kullanim icin inheritance'a ihtiyac yoktur
        //classismi.statikvariableismi sekilde herhangi bir classtaki sttaic variableyi zaten kullanabiliyorduk

        // inheritance'a en uygun access modifier PROTECTED'dir

    }
}
