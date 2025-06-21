package ChallengeFour;

public class AdvancedNinja extends BasicNinja implements Ninja{

    String specialSkill;

    @Override
    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(skill);
        System.out.println(specialSkill);
    }

    @Override
    public void executeSkill() {
        System.out.println("This is my skill, " + skill + "! 🀄");
        System.out.println("This is my special skill, " + specialSkill + "! 💪");
    }

    public AdvancedNinja() {
    }

    public AdvancedNinja(String name, int age, String skill, String specialSkill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.specialSkill = specialSkill;
    }

}
