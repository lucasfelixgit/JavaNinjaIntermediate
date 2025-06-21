package ChallengeThree;

public class Ninja {
    String name;
    int age;
    String mission;
    String missionRank;
    String missionStatus;

    public void showInfo() {
        System.out.println();
        System.out.println("🙎 Ninja Name: " + name);
        System.out.println("📋 Ninja Age: " + age);
        System.out.println("⚔️ Mission: " + mission);
        System.out.println("📊 Mission Rank: " + missionRank);
        System.out.println("⁉️ Mission Status: " + missionStatus);
    }
}
