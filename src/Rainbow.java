import java.util.HashSet;
import java.util.Set;

public class Rainbow {

    private Set<String> colour = new HashSet<>();

    public Rainbow() {

    }

    public Rainbow (Set<String> RainbowColour) {
        this.colour = RainbowColour;
    }

    public void insert(String inputColour) {
        String colour_ = inputColour.toLowerCase();

        if (colourSet().contains(colour_)) {
            colour.add(colour_);
        }

        new Rainbow(colour);
    }


    public void print() {
        if (colour.contains("red")) {
            System.out.print(" red");
        }
        if (colour.contains("orange")) {
            System.out.print(" orange");
        }
        if (colour.contains("yellow")) {
            System.out.print(" yellow");
        }
        if (colour.contains("green")) {
            System.out.print(" green");
        }
        if (colour.contains("blue")) {
            System.out.print(" blue");
        }
        if (colour.contains("indigo")) {
            System.out.print(" indigo");
        }
        if (colour.contains("violet")) {
            System.out.print(" violet");
        }
    }

    public Rainbow addiction(Rainbow another) {

        Set<String> addiction = new HashSet<>(colour);
        addiction.addAll(another.colour);

        return new Rainbow(addiction);
    }

    public Rainbow intersection(Rainbow another) {
        Set<String> intersection = new HashSet<>(colour);
        intersection.retainAll(another.colour);

        return new Rainbow(intersection);
    }

    private Set<String> colourSet() {
        Set<String> colourList = new HashSet<>();
        colourList.add("red");
        colourList.add("orange");
        colourList.add("yellow");
        colourList.add("green");
        colourList.add("blue");
        colourList.add("indigo");
        colourList.add("violet");
        return colourList;
    }

}
