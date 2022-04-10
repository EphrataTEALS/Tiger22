// This defines a simple class of critters that 
// take no actions

import java.awt.*;

public class Stone extends Critter {
    public Action getMove(CritterInfo info) {
        return Action.INFECT;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        return "S";
    }
}