package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!👋");

        /*List<String> ninjasList = new ArrayList<>();*/

        Set<String> ninjasSet = new HashSet<>();

        ninjasSet.add("Naruto");
        ninjasSet.add("Sasuke");
        ninjasSet.add("Sakura");

        System.out.println(ninjasSet);

    }
}
