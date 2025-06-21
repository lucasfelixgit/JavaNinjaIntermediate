package Polymorphism;

public class Uzumaki extends Ninja {

    Bijuu bijuu;

    @Override
    public void specialSkill() {
        System.out.println("My name is " + name + ". And this is my special skill, WIND! 🌬️");
    }

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public Uzumaki() {
        super();
    }

    public Uzumaki(String name, String village, int age, int missionsConcluded, NinjaRank rank) {
        super(name, village, age, missionsConcluded, rank);
    }

    public Uzumaki(String name, String village, int age, int missionsConcluded, NinjaRank rank, Bijuu bijuu) {
        super(name, village, age, missionsConcluded, rank);
        this.bijuu = bijuu;
    }

}
