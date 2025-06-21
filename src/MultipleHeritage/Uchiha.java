package MultipleHeritage;

public class Uchiha extends Ninja implements Sharingan {

    @Override
    public void sharinganActivated() {
        System.out.println("Sharingan Activated! 👁️🔴");
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public Uchiha() {
        super();
    }
}
