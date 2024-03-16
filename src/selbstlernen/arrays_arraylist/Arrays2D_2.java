package selbstlernen.arrays_arraylist;

public class Arrays2D_2 {

    public static void main(String[] args) {
        // cift katli arraydeki cift sayilarin toplamini bulalim
        // 2 tane for loop yapiyoruz

        int [][] arr = {{3,4,6},{9,0},{2,5,6,8,6,1}};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) { // inner array
            for (int j = 0; j < arr[i].length; j++) { // inner arraydeki elementleri kontrol eder
                if (arr[i][j]%2==0){

                    toplam+=arr[i][j];
                }
            }
        }

        System.out.println(toplam);


    }
}
