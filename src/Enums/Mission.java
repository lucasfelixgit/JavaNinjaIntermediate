package Enums;

public class Mission {

    private String name;
    private MissionRanks rank;

    public Mission(String name, MissionRanks rank) {
        this.name = name;
        this.rank = rank;
    }

    public Mission() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionRanks getRank() {
        return rank;
    }

    public void setRank(MissionRanks rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", description=" + rank.getDescription() +
                ", difficulty=" + rank.getDifficulty() +
                '}';
    }
}
