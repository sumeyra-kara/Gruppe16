package tage.tag55;

import tage.tag55.Arbeitnehmer;

public class SDET extends Arbeitnehmer {

    boolean java;
    boolean bonus;

    SDET(){}

    SDET(String name){
        super(name);
    }

    public void working(){
        System.out.println(name+ " is working..");
    }


}
