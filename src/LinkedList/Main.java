package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi!👋");

        LinkedList<String> ninjasLinkedList = new LinkedList<>();

        ninjasLinkedList.add("Naruto");
        ninjasLinkedList.add("Sasuke");
        ninjasLinkedList.add("Sakura");
        ninjasLinkedList.add(0, "Kakashi");

        System.out.println(ninjasLinkedList);


    }
}
