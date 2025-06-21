package Enums;

public class Main {
    public static void main(String[] args) {

        Mission mission1 = new Mission("Rescue the cat!", MissionRanks.D);
        System.out.println(mission1);

        Mission mission2 = new Mission("Defeat Zabuza", MissionRanks.A);
        System.out.println(mission2);


    }
}
