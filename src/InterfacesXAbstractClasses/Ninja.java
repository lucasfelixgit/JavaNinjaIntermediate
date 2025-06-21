package InterfacesXAbstractClasses;

public abstract class Ninja {
    String name;
    String village;
    int age;

    public abstract void sayNinjaName();

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public Ninja() {
    }
}
