package selbstlernen._08_arrays_arraylist;

public class Constructor2 {

    String isim = "John";
    int yas = 40;

    public Constructor2(){
        isim="Seher";
        System.out.println("isim : "+ isim);
    }

    public Constructor2(String isim){
        this();
        this.yas=30;
        System.out.println("isim : " + isim);
    }
    public Constructor2 (String isim,int yas){

        this("Murat");
        this.yas=45;
    }

    public static void main(String[] args) {
        Constructor2 obj1 = new Constructor2("Esra");
        Constructor2 obj2 = new Constructor2("Fatih",35);



    }
}
