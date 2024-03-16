package tage.tag28;

public class TasksEnBuyukSayiyiBulma {

    public static void main(String[] args) {

        dieGrößte(10,28,322);

    }

    public static void dieGrößte (int a,int b, int c){

        if (a>b && a>c){
            System.out.println(a);
        } else if (b>c) {
            System.out.println(b);
        } else  {
            System.out.println(c);
        }

    }

}
