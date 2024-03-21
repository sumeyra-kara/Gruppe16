package tage.tag66;

public class Generics<Type> {// <Type> bindet Java GENERICS ein
    Type name;
    Type nummer;
    Type flex;

    void print(){
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {

        Generics generics1 = new Generics();
        generics1.name = 50; //INTEGER
        System.out.println("generics1.name: " + generics1.name);

        Generics generics2 = new Generics();
        generics2.name = "Flexibility";
        System.out.println("generics2.name " + generics2.name);


        if(generics2.name.equals(generics1.name))
        {
            System.out.println("gleicher name");
        }
        else {
            System.out.println("name nicht gleich");
        }




    }
}
