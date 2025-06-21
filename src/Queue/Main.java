package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //array
        String[] ninjasArray = new String[3];

        //list
        List<String> ninjasList = new ArrayList<>();

        //stack
        Stack<String> ninjasStack = new Stack<>();

        /*
        * Queue
        * FIFO - first in first out*
        * head(first in queue) and tail(last in queue)
        * methods: add, poll(remove head*), peek(see head)
        * */

        Queue<String> ninjasQueue = new LinkedList<>();

        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Shikamaru");

        System.out.println(ninjasQueue);

        ninjasQueue.poll();

        System.out.println(ninjasQueue);

        System.out.println(ninjasQueue.peek());

    }
}
