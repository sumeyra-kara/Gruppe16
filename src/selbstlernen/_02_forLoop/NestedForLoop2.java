package selbstlernen._02_forLoop;

public class NestedForLoop2 {

    public static void main(String[] args) {
        /*
        kullanicidan satir ve sutun sayisini alip asagidaki sekilde tablo olusturun
        2 3 4 5 6
        3 4 5 6 7
        4 5 6 7 8
         */

        // 2 tane icice dor yapmaliyim
        for (int i = 1; i <=3 ; i++) { // satir icin
            for (int j = 1; j <=5 ; j++) { // her satirdaki sutun icin
                System.out.print(i+j + " ");
            }
            System.out.println(" ");
        }




    }
}
