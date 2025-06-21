package InterfacesXAbstractClasses;

public class Uzumaki extends Ninja implements NinjaInterface{

    @Override
    public void throwKunais() {
        System.out.println("Throwing Kunais! 🗡️");
    }

    @Override
    public void sayNinjaName() {
        System.out.println("Hello, I'm " + name + ". 🥷");
    }

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public Uzumaki() {
    }
}
