package tage.tag19;

public class Monate {

    public static void main(String[] args) {

        int monatNummer= 4;
        String monat= "";

        switch (monatNummer){
            case 1:
                monat="Januar";
                break;
            case 2:
                monat="Februar";
                break;
            case 3:
                monat="Mart";
                break;
            case 4:
                monat="April";
                break;
            case 5:
                monat="Mai";
                break;
            case 6:
                monat="Juni";
                break;
            case 7:
                monat="Juli";
                break;
            case 8:
                monat="august";
                break;
            case 9:
                monat="september";
                break;
            case 10:
                monat="Oktober";
                break;
            case 11:
                monat="Nowember";
                break;
            case 12:
                monat="December";
                break;

        }
        System.out.println(monat);
    }
}
