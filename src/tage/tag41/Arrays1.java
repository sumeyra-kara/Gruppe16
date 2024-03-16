package tage.tag41;

public class Arrays1 {
    public static void main(String[] args) {


        int List;
        List = 20;

        // Deklaration unserer Variable mit der Länge new Keyword

        int [] list1 = new int [5];

        // Initialisierung

        list1 [0]=10;
        list1 [1]=20;
        list1 [2]=40;
        list1 [3]=50;
        list1 [4]=60;



        System.out.println(list1[0]);
        System.out.println(list1[1]);
        System.out.println(list1[2]);
        System.out.println(list1[3]);
        System.out.println(list1[4]);

        // System.out.println(list1[5]); // bu elemet yok hata aliriz

        int [] list2 =  {80,54,1,3,78,43,3,2,890,2};

        int summe = 0;

        for (int i = 0; i < list2.length ; i++) {

            summe +=list2[i];
            System.out.println(list2[i]);

        }
        System.out.println("summe " + summe);

    }
}
