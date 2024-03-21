package tage.tag72;

import java.sql.SQLException;

public class ExceptionHandling3 {
    public static void main(String[] args) throws SQLException {

        try{
            System.out.println("TRY block");
            //System.out.println(1/0);
            throw new ArithmeticException("Additional information about my exception");
        }
        catch(ArithmeticException e){
            System.out.println("CATCH block für Arithmetic exceptions");
            e.printStackTrace();
        }
        catch(NullPointerException e)
        {
            System.out.println("CATCH block für NullPointer exceptions");
        }

        System.out.println("before throwing exception");
        //throw new SQLException(); // compile time fehler --> weil checked exception!
        //System.out.println("after throwing exception");

    }
}
