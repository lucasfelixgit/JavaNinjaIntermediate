package MultipleHeritage;

public class Hatake extends Ninja implements Sharingan, Anbu, Hokage {

    @Override
    public void activeHokage() {
        System.out.println("I'm a Hokage! 🦉");
    }

    @Override
    public void eliteNinja() {
        System.out.println("I'm an elite ninja from Anbu! 🥷🀄⚔️");
    }

    @Override
    public void sharinganActivated() {
        System.out.println("Sharingan Activated! 👁️🔴");
    }

    public void greetings() {
        System.out.println("My name is " + name + ". I'm a Hatake.");
    }

    public Hatake(String name, String village, int age) {
        super(name, village, age);
    }

    public Hatake() {
        super();
    }
}
