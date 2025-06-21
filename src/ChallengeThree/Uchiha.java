package ChallengeThree;

public class Uchiha extends Ninja{

   String specialSkill;

    public void showSpecialSkill() {
        System.out.println("My name is " + name + " and my special skill is " + specialSkill + "! 💪");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("💪 Special Skill: " + specialSkill);
    }

}
