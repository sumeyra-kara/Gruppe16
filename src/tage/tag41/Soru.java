package tage.tag41;

public class Soru {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {


            if (arr[i] %2 ==0){
                toplam += arr[i];
                System.out.println("Cift sayi  : " + arr[i]);
            }

        }
        System.out.println("cift sayilar toplami  : " + toplam);





        String [] names = {"Fatma" , "Ayse" , "Orkun" , "Bugra"};

        for (String name : names) {

            if (name.equals("Orkun")){
                System.out.println("Orkun burda");
                break;
            }

            System.out.println(name);


        }

    }
}
