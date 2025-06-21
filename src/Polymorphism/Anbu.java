package Polymorphism;

final public class Anbu {

    String name;
    String village;
    int age;

    public void anbuGreetings() {
        System.out.println("I'm an Anbu ninja!");
    }

    public Anbu(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public Anbu() {
    }

}

