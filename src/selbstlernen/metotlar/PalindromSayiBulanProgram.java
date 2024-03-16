package selbstlernen.metotlar;

public class PalindromSayiBulanProgram {



    public static void main(String[] args) {

        // her iki taraftan da okundugu zaman okunus yönuyle ayni olan sayilara palindrom sayi denir
        // 1, 4, 88, 101 gibi

        System.out.println(isPalindrom(1234));

    }
    static boolean isPalindrom (int number) {

        int temp = number, reverseNumber= 0, lastNumber;

        while (temp !=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp/ 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;



    }


}
