package selbstlernen._12_collections;

import java.util.List;
import java.util.Set;

public class _13_Beispiel {
    public static void main(String[] args) {
        // Arrayden ArrayList

        int [] arrayInt = {1,2,3};

        List<int[]> list = List.of(arrayInt);


        // Set'den ArrayList

        Set<Integer> setInt = Set.of(1,2,3,4);
        System.out.println(setInt);

    }
}
