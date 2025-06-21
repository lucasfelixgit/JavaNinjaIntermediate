package ToString;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");

        Ninja naruto = new Ninja("Naruto Uzumaki", "Leaf Village", 15);

        System.out.println(naruto);
        System.out.println(naruto.name);
        System.out.println(naruto.village);
        System.out.println(naruto.age);

    }
}
