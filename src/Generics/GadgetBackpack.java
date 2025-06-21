package Generics;

import java.util.ArrayList;
import java.util.List;

public class GadgetBackpack<T> {

    private List<T> gadgets;

    public void addGadgets(T gadget) {
        gadgets.add(gadget);
    }

    public GadgetBackpack() {
        this.gadgets = new ArrayList<>();
    }

    public List<T> getGadgets() {
        return gadgets;
    }

    @Override
    public String toString() {
        return "GadgetBackpack{" +
                "gadgets=" + gadgets +
                '}';
    }
}
