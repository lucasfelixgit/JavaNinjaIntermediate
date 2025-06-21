package Constructors;

//abstract classes (superclasses) can't be instantiated, only extended.
public abstract class Hokage {

    String name;
    int age;
    boolean active;
    String village;

    public abstract void hokageIQ();

    //noArgs constructor
    public Hokage() {
    }

    //allArgs constructor
    public Hokage(String name, int age, boolean active, String village) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.village = village;
    }

}
