package selbstlernen._12_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _2_LinkedList_1 {
    /*
    Linked List:
    Yavas calisir. tek tek bakip kontrol edilir elemanlar.(Dezavantaji)

    - Bir LinkedList olusturuldugunda ilk element olarak HEAD olusturulur, head sadece 1. elementin
       adres bilgisini tutar.
    - Sonraki elementler data ve kendindem sonraki elemntin adresini tutan iki parcadan olusur.
    - Bu ikili yapinin herbirine NODE(Dügüm) ismi verilir.
    - 3200----15-3600-----3-4000------17-4400-------90-null.
      (HEAD)  (15:Content, 3600:Adress,Referans 15-3600 : Node)

    - Son node'a tail(kuyruk) denir ve adres bolumunde NulllPointer bulunur.
    - Linked yapisindan dolayi element eklem silme cok kolaydir ancak elementlere ulasmak yavastir.


    - Linked List 3 Interface'i Implement etmistir. Bunlar: List, Queue, Deque
      Deque, iki uctan ekliyor,basina ve sonuna yani -----Queue-  sirayla ekliyor
      LinkedList istedigimiz yerden ekliyor
    - Linked List class'i interface'lerin child'i olan bir concrete class oldugundan 3 Interfacedeki methodlarin
      tamaini override etmistir. Data turu olarak LinkedList secilirse 3 Interfacein tum özelllikleri kullanilabilir


     */

    // List Deque Queue Interfacedir

    LinkedList<String> linked1 = new LinkedList<>();

    // List<String> linked2 = new List<>(); hata verir List bir abstract buraya bu sekilde yazamam
    List<String> linked2 = new LinkedList<>();
    // List<String> a =new ArrayList<>(); Arraylist child List ise  parent class'i oldugu icin bu sekilde olustrlblr
    Queue<String> linked3 = new LinkedList<>();
    Deque<String> linked4 = new LinkedList<>();

}
