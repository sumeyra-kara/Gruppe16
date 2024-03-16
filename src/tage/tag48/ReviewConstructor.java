package tage.tag48;

public class ReviewConstructor {

    int nummer;
    String id;

    ReviewConstructor(){
    }

    ReviewConstructor(int a,String b){
        this.nummer=a;
        this.id=b;
    }

    public static void main(String[] args) {

        ReviewConstructor rw1 = new ReviewConstructor();
        rw1.id="xyz";

        ReviewConstructor rw2= new ReviewConstructor(50,"text1");

        System.out.println(rw1.id); // xyz
        System.out.println(rw1.nummer); // 0
        System.out.println("****");
        System.out.println(rw2.id); // text1
        System.out.println(rw2.nummer); // 50



    }
}
