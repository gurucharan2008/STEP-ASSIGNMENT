/**
 * Week 7 - Problem 4: The Traffic Light
 * Color cycles only via next() — no direct setter
 */
class TrafficLight {
    private String color;
    private final String id;

    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED"; // starts on red
    }

    // Only way to change the color
    public String next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else { // YELLOW
            color = "RED";
        }
        return color;
    }

    // Read-only access
    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }
}

public class P4_TrafficLight {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");

        System.out.println(t.getColor()); // RED
        System.out.println(t.next());     // GREEN
        System.out.println(t.next());     // YELLOW
        System.out.println(t.next());     // RED
    }
}
