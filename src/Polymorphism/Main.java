package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Leaf Village", 17, 20, NinjaRank.CHUUNIN, Bijuu.KURAMA);

        naruto.specialSkill();
        naruto.battleStrategy();
        naruto.battleIntelligence();
        naruto.throwKunais();
        System.out.println(naruto.bijuu);


        System.out.println("-----------------------------------------------------------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Leaf Village", 18, 20, NinjaRank.CHUUNIN);

        sasuke.specialSkill();
        sasuke.battleStrategy();


        System.out.println("-----------------------------------------------------------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Leaf Village", 27, 60, NinjaRank.JOUNIN);

        itachi.specialSkill();
        itachi.battleStrategy();


        System.out.println("-----------------------------------------------------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Leaf Village", 45, 900, NinjaRank.KAGE);

        madara.specialSkill();
        madara.battleStrategy();
        madara.battleIntelligence(150);

    }
}