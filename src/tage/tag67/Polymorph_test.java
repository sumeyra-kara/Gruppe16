package tage.tag67;

import java.util.ArrayList;

public class Polymorph_test {
    public static void main(String[] args) {

        Employer_polymorph employer = new Employer_polymorph(); // child
        employer.eating();
        employer.sleeping();
        employer.speaking();
        System.out.println("*******************");

        Person_polymorph person1 = new Person_polymorph(); // parent
        Person_polymorph person2 = new Student_polymorph(); // child
        Student_polymorph person3 = new Student_polymorph();
        Person_polymorph person = new Employer_polymorph(); // child objekt erstellung polymorph
        Person_polymorph personXY;

        person.speaking();
        person1.speaking();
        person2.speaking();


        ArrayList<Student_polymorph> studentList = new ArrayList<>(); // nur referenzen von Student erlaubt
        studentList.add(person3);

        ArrayList<Person_polymorph> personList = new ArrayList<>(); // referenz von person, student und employer erlaubt
        personList.add(person1);
        personList.add(person3);
        personList.add(person2);




    }
}
