package selbstlernen.inheritance;

public class S_Personal {

    String isim="Isim belirtilmemis";
    String unvan="personel unvani belirtilmemis";
    boolean izindeMi;

    public void standartMaas(){
        System.out.println("personel asgari ucreti : " + 8500);
    }
    public void ozelSigorta(){
        System.out.println("personelden katki payi alinarak ozel sigorta yapilir");
    }

}
