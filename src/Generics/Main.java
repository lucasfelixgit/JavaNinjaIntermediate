package Generics;

public class Main {
    public static void main(String[] args) {

        NinjaGadget kunai = new NinjaGadget("Kunai");
        NinjaGadget shuriken = new NinjaGadget("Shuriken");
        NinjaGadget scroll = new NinjaGadget("Scroll");

        GadgetBackpack<NinjaGadget> gadgetBackpack = new GadgetBackpack();
        gadgetBackpack.addGadgets(kunai);
        gadgetBackpack.addGadgets(shuriken);
        gadgetBackpack.addGadgets(scroll);

        System.out.println(gadgetBackpack);

    }
}
