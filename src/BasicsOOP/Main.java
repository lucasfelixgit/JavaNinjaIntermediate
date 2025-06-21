package BasicsOOP;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi! 👋");

        //Object 1 - Sasuke Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.village = "Leaf Village";
        sasuke.age = 17;

        //Applying methods to an objects
        sasuke.sharinganActivated();

        //Object 2 - Naruto Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.village = "Leaf Village";
        naruto.age = 16;

        naruto.sageModeActivated();

        //Object 3 - Sakura Haruno
        Haruno sakura = new Haruno();
        sakura.name = "Sakura Haruno";
        sakura.village = "Leaf Village";
        sakura.age = 17;

        sakura.HealingActivated();

        //Object 4 - Hinata Hyuga
        Hyuga hinata = new Hyuga();
        hinata.name = "Hinata Hyuga";
        hinata.village = "Leaf Village";
        hinata.age = 16;

        hinata.ByakuganActivated();

        //Object 5 - Boruto Hyuga Uzumaki
        Boruto boruto = new Boruto();
        boruto.name = "Boruto Hyuga Uzumaki";
        boruto.village = "Leaf Village";
        boruto.age = 10;

        boruto.sageModeActivated();
        boruto.karmaActivated();
        boruto.jouganActivated();
    }
}
