package ChallengeThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userOption = 0;
        Scanner sc = new Scanner(System.in);
        Ninja[] ninjas = new Ninja[0];
        int quantity;
        int uchiha;
        int updateOption;
        int deleteOption;

        while (userOption != 5) {
            System.out.println();
            System.out.println("🥷 NINJA MANAGEMENT SYSTEM");
            System.out.println("1 - Add Ninjas ➕");
            System.out.println("2 - Show Info 📋");
            System.out.println("3 - Update Special Skills 💪");
            System.out.println("4 - Delete a Ninja ❌");
            System.out.println("5 - Exit 🏃‍➡️");

            System.out.println();
            System.out.println("Please, select your desired option: ");

            userOption = sc.nextInt();
            sc.nextLine();

            switch (userOption) {
                case 1:
                    System.out.println();
                    System.out.println("1 - Add Ninjas ➕");
                    System.out.println("How many ninjas would you like to register?");
                    quantity = sc.nextInt();
                    sc.nextLine();

                    ninjas = new Ninja[quantity];

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println();
                        System.out.println("🥷" + (i + 1) + "º Ninja");
                        System.out.println("Is this ninja an Uchiha? (1 - Yes | 2 - No)");
                        uchiha = sc.nextInt();
                        sc.nextLine();

                        if (uchiha == 1) {
                            ninjas[i] = new Uchiha();

                            System.out.println();
                            System.out.println("🀄 Uchiha Clan Ninja (This ninja has a special skill 💪): ");

                            System.out.println("🙎 Ninja Name: ");
                            ninjas[i].name = sc.nextLine();

                            System.out.println("📋 Ninja Age: ");
                            ninjas[i].age = sc.nextInt();
                            sc.nextLine();

                            System.out.println("⚔️ Mission: ");
                            ninjas[i].mission = sc.nextLine();

                            System.out.println("📊 Mission Rank: ");
                            ninjas[i].missionRank = sc.nextLine();

                            System.out.println("⁉️ Mission Status: ");
                            ninjas[i].missionStatus = sc.nextLine();

                            System.out.println("💪 Special Skill: ");
                            ((Uchiha)ninjas[i]).specialSkill = sc.nextLine();
                        }
                        else {
                            ninjas[i] = new Ninja();

                            System.out.println();
                            System.out.println("🙎 Ninja Name: ");
                            ninjas[i].name = sc.nextLine();

                            System.out.println("📋 Ninja Age: ");
                            ninjas[i].age = sc.nextInt();
                            sc.nextLine();

                            System.out.println("⚔️ Mission: ");
                            ninjas[i].mission = sc.nextLine();

                            System.out.println("📊 Mission Rank: ");
                            ninjas[i].missionRank = sc.nextLine();

                            System.out.println("⁉️ Mission Status: ");
                            ninjas[i].missionStatus = sc.nextLine();
                        }
                    }

                    System.out.println();
                    System.out.println("All the ninjas were successfully registered! ✅");
                    System.out.println("Going back to menu...");

                    break;

                case 2:
                    System.out.println();
                    System.out.println("2 - Show Info 📋");

                    System.out.println("Here's a list with all the ninjas registered with their respective info: ");

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println();
                        System.out.println("🥷" + (i + 1) + "º Ninja Information: ");
                        ninjas[i].showInfo();
                    }

                    System.out.println();
                    System.out.println("All the ninjas were successfully listed! ✅");
                    System.out.println("Going back to menu...");

                    break;

                case 3:
                    System.out.println();
                    System.out.println("3 - Update Special Skills 💪");
                    System.out.println("Here's a list with all the ninjas registered with special skills: ");
                    System.out.println();

                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] instanceof Uchiha) {
                            System.out.println("🥷" + (i+1) + "º Ninja: " + ninjas[i].name);
                        }
                    }

                    System.out.println();
                    System.out.println("Select the ninja you'd like to update skill (Use the number): ");
                    updateOption = sc.nextInt();
                    sc.nextLine();

                    if (ninjas[updateOption - 1] instanceof Uchiha) {
                        System.out.println();
                        System.out.println("Ninja: " + ninjas[updateOption - 1].name);
                        System.out.println("Current Special Skill: " + ((Uchiha) ninjas[updateOption - 1]).specialSkill);
                        System.out.println("Digit the new skill: ");
                        ((Uchiha) ninjas[updateOption - 1]).specialSkill = sc.nextLine();
                    }
                    else {
                        System.out.println();
                        System.out.println("Invalid Option! Try Again ❌");
                        System.out.println("Going back to menu...");
                        break;
                    }

                    System.out.println();
                    System.out.println("The skill was successfully updated! ✅");
                    System.out.println("Going back to menu...");

                    break;

                case 4:
                    System.out.println();
                    System.out.println("4 - Delete a Ninja ❌");
                    System.out.println("Here's a list with all the ninjas registered: ");
                    System.out.println();

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("🥷" + (i+1) + "º Ninja: " + ninjas[i].name);
                    }

                    System.out.println();
                    System.out.println("Select the ninja you'd like to delete (Use the number): ");
                    deleteOption = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < ninjas.length; i++) {
                        if (i == (deleteOption - 1)) {
                            ninjas[i] = new Ninja();
                        }
                    }

                    System.out.println();
                    System.out.println("The Ninja was successfully deleted! ❌");
                    System.out.println("Going back to menu...");

                    break;

                case 5:
                    System.out.println();
                    System.out.println("5 - Exit 🏃‍➡️");
                    System.out.println("Goodbye, Hokage!👋");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid Option! Try Again ❌");
                    System.out.println();
                    break;
            }

        }

        sc.close();

    /*
        Ninja naruto = new Ninja();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 16;
        naruto.mission = "Rescue the Hostage!";
        naruto.missionRank = 'A';
        naruto.missionStatus = "Finished!";

        naruto.showInfo();

        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 17;
        sasuke.mission = "War Sabotage!";
        sasuke.missionRank = 'S';
        sasuke.missionStatus = "On Going...";
        sasuke.specialSkill = "Sharingan";

        sasuke.showInfo();
        sasuke.showSpecialSkill();
    */

    }
}
