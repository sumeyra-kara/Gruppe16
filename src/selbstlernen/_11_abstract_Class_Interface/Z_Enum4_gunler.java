package selbstlernen._11_abstract_Class_Interface;

public enum Z_Enum4_gunler {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);


    private int gun;
    private Z_Enum4_gunler (int gun){
        this.gun=gun;
    }

    public int gunyaz (){
        return this.gun;
    }

}
class Test3{

    public static void main(String[] args) {
        System.out.println(Z_Enum4_gunler.PAZARTESI.gunyaz()); //1
    }

}
