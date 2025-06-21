package Encapsulation;

public abstract class Ninja {

    private String name;
    private String village;
    private int age;
    private int missionsConcluded;
    private double height;

    public Ninja(String name, String village, int age, int missionsConcluded, double height) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.missionsConcluded = missionsConcluded;
        this.height = height;
    }

    public Ninja() {
    }

    //getters (get values) = public type* get + variableName(){}
    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public int getAge() {
        return age;
    }

    public int getMissionsConcluded() {
        return missionsConcluded;
    }

    public double getHeight() {
        return height;
    }

    //setters (set values) = public type* set + variableName(type* param) { this.attr* = arg }
    public void setName(String name) {
        this.name = name;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMissionsConcluded(int missionsConcluded) {
        this.missionsConcluded = missionsConcluded;
    }

    public void setHeight(double height) {
        this.height = height;
    }



}
