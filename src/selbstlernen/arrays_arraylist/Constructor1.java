package selbstlernen.arrays_arraylist;

public class Constructor1 {
    // eger bir const. icinde baska bir constructor cagirmak istiyorsak  cons. call kullanmaliyiz.
    // bunun icin this() kullanilur.--istersek icini parametreli de yapabiliriz.
    // kural: this() cons.'un mutlaka ilk satirina yazilir ve sadece 1 tane yazilir

    String isim = "John";
    int yas = 40;

    public Constructor1(){
        isim="Seher";
        yas=38;
    }
    public Constructor1(String isim,int yas){
        // this()-- bu sekilde diger cons. cagirabiliriz-- ama bunun yeri burasi olmali.ve sadece 1 tane olabilir
        this.isim=isim;
        this.yas=30;
    }

    public static void main(String[] args) {
            Constructor1 constructor1 = new Constructor1();
            Constructor1 constructor2 = new Constructor1("Fatih",35);

        System.out.println("isim : " + constructor1.isim + " yas : " + constructor2.yas);

    }


}
