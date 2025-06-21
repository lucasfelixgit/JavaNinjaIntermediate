package ToString;

public class Ninja {

    String name;
    String village;
    int age;

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public Ninja() {
    }

    //add method toString
    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", village='" + village + '\'' +
                ", age=" + age +
                '}';
    }

}
