package Generics;

public class NinjaGadget {

    private String name;

    public NinjaGadget(String name) {
        this.name = name;
    }

    public NinjaGadget(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ninja Gadget: " + name;
    }

}
