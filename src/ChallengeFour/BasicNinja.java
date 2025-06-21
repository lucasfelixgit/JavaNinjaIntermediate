package ChallengeFour;

public class BasicNinja implements Ninja{

    String name;
    int age;
    String skill;

    @Override
    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(skill);
    }

    @Override
    public void executeSkill() {
        System.out.println("This is my skill, " + skill + "! 🀄");
    }

    public BasicNinja() {
    }

    public BasicNinja(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }
}

