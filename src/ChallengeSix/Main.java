package ChallengeSix;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi!👋");

        LinkedList<Ninja> ninjas = new LinkedList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", "Leaf Village", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Leaf Village", 18));
        ninjas.add(new Ninja("Sakura Haruno", "Leaf Village", 17));
        ninjas.add(new Ninja("Hinata Hyuga", "Leaf Village", 16));
        ninjas.add(new Ninja("Rock Lee", "Leaf Village", 16));
        ninjas.add(new Ninja("Kakashi Hatake", "Leaf Village", 30));
        ninjas.add(new Ninja("Hashirama Senjuu", "Leaf Village", 80));

        System.out.println(ninjas);

        ninjas.remove(6);

        System.out.println(ninjas);

        System.out.println(ninjas.get(5));

        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

        ninjas.removeFirst();

        System.out.println(ninjas);

        ninjas.addFirst(new Ninja("Naruto Uzumaki", "Leaf Village", 16));

        System.out.println(ninjas);
    }
}
