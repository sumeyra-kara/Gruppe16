package tage.tag65;

public class Differenz {

    public static void main(String[] args) {

        // Exercise 1
        int[] data = { 121, 124, 110, 73, 111, 132, 142, 166, 175, 81, 166, 143, 107, 129 };

        // Exercise 2
        System.out.print("Tag\t\t\t");
        for(int i=0; i<data.length; i++) {
            System.out.print("\t"+i);
        }
        System.out.println();
        System.out.print("Feinstaubwert");
        for(int i=0; i<data.length; i++) {
            System.out.print("\t"+data[i]);
        }
        System.out.println();
        // Exercise 3
        int diff = 0;
        int day = 0;
        for(int i=1; i<data.length; i++)
        {
            if(data[i] - data[i-1] > diff)
            {
                diff = data[i] - data[i-1];
                day = i-1;
            }
        }
        System.out.println("Größter Unterschied zwischen "+day+" und tag "+(day+1)+" von "+diff);
    }
}
