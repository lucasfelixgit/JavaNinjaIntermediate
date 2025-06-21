package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        * Arrays:
        * Static - Type/Size strict defined
        * */
        String[] ninjasArray = new String[3];
        
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura Haruno";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        /*
        * Lists:
        * Dynamic - Can change it's size automatically
        * */
        List<String> ninjasList = new ArrayList<>();
        
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);

        ninjasList.remove("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);

        ninjasList.set(2, "Hashirama Senjuu");

        System.out.println("ninjasList = " + ninjasList);

        System.out.println(ninjasList.size());

    }
}
