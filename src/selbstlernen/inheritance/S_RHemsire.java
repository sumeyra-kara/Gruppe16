package selbstlernen.inheritance;

public class S_RHemsire extends S_PMuhasebe{

    String unvan ="Hemsire";

    String sgkNo;
    public void standartMaas(){
        System.out.println("Hemsireler minimum 10000Tl maas alir ");
    }

    public void ozelSigorta() {
        System.out.println("Hemsireler aylik 300 tl ile aylik sigorta yaptirabilir");
    }

    public void nobetUcreti (int nobetSayisi){
        System.out.println(nobetSayisi*200);

    }

    public static void main(String[] args) {
        S_RHemsire hemsire =  new S_RHemsire();
        hemsire.method();
    }

    public void method() {
        System.out.println(this.unvan); // bu classstaki unvani yazdirir bu sekilde --hemsire
        System.out.println(super.unvan); // personal siniftaki unvani yazdirir
        System.out.println(this.sgkNo); // bu class'ta sgk no aslinda yok ama extends oldugu icin parente bakar
        System.out.println(super.sgkNo); // bu bu class'a bakmaz direkt gider parent class'a bakar

        this.standartMaas();//Hemsireler minimum 10000Tl maas alir
        this.fazlaMesai(3); // 600
        super.fazlaMesai(4); // bu sinifa bakmadan parent class'a bakar onu yazdirir--800

        this.ozelSigorta();//Hemsireler aylik 300 tl ile aylik sigorta yaptirabilir
        super.ozelSigorta();//personelden katki payi alinarak ozel sigorta yapilir


        S_PMuhasebe child2 = new S_RHemsire(); // böyle farkli yazilirsa ilk yazdigimizi esas aliriz
        // yani bu hemsire klassinndan degil sanki muhasebe sinifindan o clasin ozellikleri esas alinir

        System.out.println(child2.unvan); // muhasebe klassina bakar yoksa onun ustu personal sinifina
        // cunku sanki muhasebe klass'indann obje olusturmus gibi bakacagiz
        System.out.println(child2.sgkNo);


    }

}
