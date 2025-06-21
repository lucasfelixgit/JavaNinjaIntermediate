package ChallengeFour;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!👋");

        BasicNinja naruto = new BasicNinja("Naruto Uzumaki", 16, "Throwing Kunais");
        naruto.showInfo();
        naruto.executeSkill();

        AdvancedNinja sasuke = new AdvancedNinja("Sasuke Uchiha", 17, "Throwing Kunais", "Sharingan");
        sasuke.showInfo();
        sasuke.executeSkill();
    }
}