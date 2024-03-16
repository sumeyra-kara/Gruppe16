package tage.tag51;

public class RewiewArrays {
    public static void main(String[] args) {


        int [] array1 = new int[10];
        array1[0]=10;

        int [] array2= {10,10,20,30,40};
        array2[0]=15;

        double [] array3 = {12.2,12.3,123.11};

        String [] cities = {"München","Frankfur","New York","Istanbul"};

        for (String city: cities){
            //System.out.println(city);
            if (city == "München") {
                System.out.println("Stadt ist in Array vorhanden");
            }

        }


    }
}
