package tage.tag69;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListBeispiel {
    public static void main(String[] args) {

        // STRG + N sucht nach Klassen und speziellen Klassen (Interfaces, Abstrakte Klassen)
        // STRG + F12 zeigt alle Member einer Klasse an
        // funktionstaste deaktivieren!

        // Verkettete Liste / Linked List:

        LinkedList<String> list = new LinkedList<>();

        list.add("W");
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Linked List / Verkettete Liste: " + list);

        // Vector

        Vector<String> vector = new Vector<>();

        vector.add("CC");
        vector.add("DD");
        vector.add("AA");

        System.out.println("vector: " + vector);

        System.out.println("vector getFirst element: " + vector.firstElement());
        System.out.println("vector get(0 )" + vector.getFirst());

        // Stack

        Stack<String> stack = new Stack<>(); // LIFO: Last in First out

        stack.add("A");
        stack.add("B");
        stack.add("X");
        stack.add("Y");
        stack.add("Z");

        System.out.println("Stack vor pop: " + stack);

        System.out.println("stack.pop: " + stack.pop()); // letztes hinzugefügtes element wird zurückgegeben und dann gelöscht

        System.out.println("Stack nach pop: " + stack);

        System.out.println("stack.push: " + stack.push("Z")); // Push legt ein Element oben auf den Stack

        System.out.println("Stack nach pop: " + stack);

        System.out.println("stack peek: " + stack.peek()); // return element oben auf dem Sack aber lösche es nicht

        System.out.println("Stack nach pop: " + stack);


    }

}
