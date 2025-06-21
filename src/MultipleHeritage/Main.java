package MultipleHeritage;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Leaf Village", 17);
        sasuke.sharinganActivated();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Leaf Village", 40);
        kakashi.greetings();
        kakashi.sharinganActivated();
        kakashi.eliteNinja();
        kakashi.activeHokage();

    }
}
