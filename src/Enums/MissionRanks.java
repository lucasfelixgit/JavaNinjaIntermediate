package Enums;

public enum MissionRanks {

    D("Low", 1),
    C("Medium", 2),
    B("High", 3),
    A("Very High", 4),
    S("Extreme", 5);

    private String description;
    private int difficulty;

    MissionRanks(String description, int difficulty) {
        this.description = description;
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }

}
