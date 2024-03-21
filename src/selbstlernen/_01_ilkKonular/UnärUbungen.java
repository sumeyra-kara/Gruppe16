package selbstlernen._01_ilkKonular;

public class UnärUbungen {
    public static void main(String[] args) {

        int variable = 100;
        System.out.println(variable); //100

        int postIncrement = variable++;
        System.out.println("postIncrement: " + postIncrement);//100
        System.out.println("variable: " + variable); //101

        System.out.println(postIncrement++); // 100
        System.out.println(postIncrement++); //101
        System.out.println(postIncrement++); //102


    }
}
