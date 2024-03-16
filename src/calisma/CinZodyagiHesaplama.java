package calisma;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {

        int dogumYil = 1990;
        String burc="";
        int result = dogumYil % 12;

        if (dogumYil%12==0){
            burc = "Maymun";
        } else if (result==1) {
           burc ="Horoz";
        } else if (result==2) {
            burc ="Köpek";
        } else if (result==3) {
            burc ="Domuz";
        } else if (result==4) {
            burc ="Fare";
        } else if (result==5) {
            burc ="Öküz";
        } else if (result==6) {
            burc ="Kaplan";
        } else if (result==7) {
            burc ="Tavsan";
        } else if (result==8) {
            burc ="Ejderha";
        } else if (result==9) {
            burc ="Yilan";
        } else if (result==10) {
            burc ="At";
        } else if (result==11) {
            burc ="Koyun";
        }
        System.out.println("Burcunuz : " + burc);
        // veya da int result = dogumYil%12; bunu deklere edebeiliriz ama switch yapsak daha iyi
        // switch(result) case 0: system.out.println("at") , break;--- case 1: ....

    }
}
