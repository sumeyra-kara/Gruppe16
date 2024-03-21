package selbstlernen._08_arrays_arraylist;

public class Array10 {

    // Java Generic

    public static void main(String[] args) {
         int [] numbers = {1,2,3,4,5};
         String [] isim = {"Ayse","Fatma"};
         Integer [] numbers1 = {11,21,31};
         Character [] c ={'a','b','c','d'};

         printFirst(isim);
        //  printFirst(numbers); primitiveler oicin bunu görmez ama wrapper class olarak yazarsak sikinti olmaz
        printFirst(numbers1);
        printFirst(c);




    }

    public static <Object> void printFirst(Object[] arr){
        System.out.println(arr[0]);
    }
}
