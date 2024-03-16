package tage.tag48;

public class SDET {

    String name;
    int age;
    char gender;
    String company;
    double salary;
    boolean isSuccessful=true;

    SDET(){
    }
    SDET(String name, int age,char gender,String company, double salary){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.company=company;
        this.salary=salary;
        this.isSuccessful=true;

    }

    public SDET(String veli, int i, char f, String microsoft, int i1, boolean b) {
    }

    public void  increaseSalary (double raiseAmount){
        salary+=raiseAmount;
    }

    public void companyChange (String newCompany){
        company=newCompany;
    }
    /*
    public static void main(String[] args) {

        SDET sdet1= new SDET("sümeyra",32,'F',"Microsoft",80000,true);


        System.out.println(sdet1.name);
        System.out.println(sdet1.age);
        System.out.println(sdet1.gender);
        System.out.println(sdet1.company);
        System.out.println(sdet1.salary);
        System.out.println(sdet1.isSuccessful);

        sdet1.companyChange("Facebook");
        System.out.println(sdet1.company);
    }


     */

}

class SDETtest{

    public static void main(String[] args) {

        SDET sdet1=new SDET("name1",20,'F',"Amazon",100000,true);
        SDET sdet2= new SDET("veli",30,'F',"Microsoft",100000,true);

        System.out.println(sdet1.salary);
        sdet1.increaseSalary(20000);
        System.out.println(sdet1.salary);

        System.out.println(sdet2.company);
        sdet2.companyChange("google");
        System.out.println(sdet2.company);

        System.out.println(sdet2.name);
        System.out.println(sdet2.age);
        System.out.println(sdet2.gender);
        System.out.println(sdet2.company);
        System.out.println(sdet2.salary);
        System.out.println(sdet2.isSuccessful);


    }

}

