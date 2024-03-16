package tage.tag24;

public class WhileLoop {

    public static void main(String[] args) {


        //Prufe ob briefe im Briefkasten sind. wenn ein Brief im Briefkasten ist,entnehme den Brief.

        boolean istBriefVorhanden= false;

        for (int i=0; i <100; i ++){
            System.out.println("Prufe ob Briefe im Briefkasten ist");

            if (istBriefVorhanden){
                System.out.println("hole den brief aus dem Briefkasten");
            }
        }
        System.out.println("------");

        int counter=0;

        while (counter<100){
            System.out.print("welcome");
            counter++;
        }
        System.out.println("----");

        int x = 1000;
        while (x > 0) {
            x++;

        }
        System.out.println("x : " + x);

    }
}
