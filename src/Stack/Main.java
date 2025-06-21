package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
         * Arrays:
         * Static - Type/Size strict defined
         * */
        String[] ninjasArray = new String[3];
        
        ninjasArray[0] = "Naruto Uzumaki";

        /*
         * Lists:
         * Dynamic - Can change it's size automatically
         * */
        List<String> ninjasList = new ArrayList<>();
        
        ninjasList.add("Naruto Uzumaki");

        /*
        * Stack
        * LIFO - last in first out*
        * Methods: push(add), pop(remove), peek(verify the stack top element), size(verify size)
        * */
        Stack<String> ninjasStack = new Stack<>();
        
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        
        System.out.println("ninjasStack = " + ninjasStack);
        
        ninjasStack.pop();

        System.out.println("ninjasStack = " + ninjasStack);

        System.out.println(ninjasStack.peek());
        System.out.println(ninjasStack.size());
  }
}
