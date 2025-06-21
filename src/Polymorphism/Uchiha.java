package Polymorphism;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void specialSkill() {
        System.out.println("My name is " + name + ". And this is my special skill, FIRE! 🔥️");
    }

    /*
    * Method:
    * Implemented from SharinganInterface
    * */
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

    public Uchiha(String name, String village, int age, int missionsConcluded, NinjaRank rank) {
        super(name, village, age, missionsConcluded, rank);
    }
}

