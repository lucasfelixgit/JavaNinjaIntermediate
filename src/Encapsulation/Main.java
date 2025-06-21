package Encapsulation;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi!");

        Uzumaki naruto = new Uzumaki("Naruto", "Leaf Village", 17, 50, 1.75);
        naruto.setName("Naruto Uzumaki");
        System.out.println(naruto.getName());


        Uchiha sasuke = new Uchiha("Sasuke", "Leaf Village", 18, 50, 1.75);
        sasuke.setName("Sasuke Uchiha");
        System.out.println(sasuke.getName());

    }
}
