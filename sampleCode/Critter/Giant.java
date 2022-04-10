import java.awt.*;

/**
 * Created by daackerman on 2/3/2017.
 */
public class Giant extends Critter {
    private int steps;
    private Color color;

    public Giant() {
        super();
        color = Color.GRAY;
        steps = 0;
    }

    public String toString() {
        String[] words = {"fee", "fie", "foe", "fum"};
        return words[steps % 4];
    }

    public Color getColor() {
        return color;
    }

    public Action getMove(CritterInfo info) {
        steps++;
        if (info.getFront().equals(Neighbor.OTHER)) {
            return Action.INFECT;
        } else if (info.getFront().equals(Neighbor.EMPTY)) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}
