package tage.tag65;

public class EnumTest {
    public static void main(String[] args) {

        Tag tage1 = Tag.MONTAG;
        Tag tage2 = Tag.DIENSTAG;

        System.out.println("Enum Nr1: " + Tag.MONTAG);
        System.out.println("Enum Nr1: " + tage2);

        Tag tag = Tag.SAMSTAG;
        boolean isWeekend = true;

        switch (tag){
            case MONTAG:
            case DIENSTAG:
            case MITTWOCH:
            case DONNERSTAG:
            case FREITAG:
                isWeekend = false;
                break;
            case SAMSTAG:
            case SONNTAG:
                isWeekend = true;
                break;
            default:
                System.out.println("ungültige eingabe");
        }

        System.out.println("Ist Wochenende? " + isWeekend);

        for(Tag t : Tag.values()){ // for each
            System.out.println("Tag: " + t);
        }

        for(Werte w : Werte.values()){
            System.out.println("Werte: " + w);
        }



    }
}
