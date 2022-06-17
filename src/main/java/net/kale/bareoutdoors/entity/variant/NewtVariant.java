package net.kale.bareoutdoors.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum NewtVariant {
    EASTERN(0),
    ANDERSONS_CROCODILE(1),
    FIRE_BELLY(2),
    CRESTED(3);

    private static final NewtVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(NewtVariant::getId)).toArray(NewtVariant[]::new);
    private final int id;

    NewtVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static NewtVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
