package selbstlernen.abstract_Class_Interface;

public interface I_Interface_Istisnalar {

    // void toplama1 (){ } --- bu sekilde interface icinde bodyli method olusturamam cunku abstract olmali

    void toplama();

    static void aciklama(){
        System.out.println("Bu methodu implement etmek mecburi degil");
    }
    default void ekIsler(){
        System.out.println("Default Keyword ile body'Si olan method olusturulabilir");
    }

}
