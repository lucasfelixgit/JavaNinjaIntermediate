package Polymorphism;

public abstract class Ninja implements BattleStrategy {

    //TODO: Include new attributes (missionsConcluded, rank)
    //TODO: ranks (genin, chuunin, jounin, kage)

    String name;
    String village;
    int age;
    int missionsConcluded;
    NinjaRank rank;
    final double height = 1.70;

    //general method
    public void specialSkill() {
        System.out.println("This is my special skill!");
    }

    final public void throwKunais() {
        System.out.println("Throwing Kunais! 🗡️ (MOTHER CLASS FINAL* METHOD)");
    }

    @Override
    public void battleStrategy() {
        System.out.println("My name is " + name + ". This is my battle strategy! 🪖⚔️");
    }

    //Method Overload battleIntelligence()
    @Override
    public void battleIntelligence() {
        System.out.println("My name is " + name + ". This is my battle intelligence! 🦉🤓⚔️");
    }

    @Override
    public void battleIntelligence(int iq) {
        if (iq >= 150) {
            System.out.println("Your IQ is: " + iq + ", You're a genius ninja! 🦉");
        } else if (iq >= 130) {
            System.out.println("Your IQ is: " + iq + ", You're a intelligent ninja! 🤓");
        } else {
            System.out.println("Your IQ is: " + iq + ", You need to study more! 📝");
        }
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public Ninja() {
    }

    //TODO: Constructor Overload
    //no need to redeclare attributes, use this(att)* instead

    public Ninja(String name, String village, int age, int missionsConcluded, NinjaRank rank) {
        this(name, village, age);
        this.missionsConcluded = missionsConcluded;
        this.rank = rank;
    }
}
