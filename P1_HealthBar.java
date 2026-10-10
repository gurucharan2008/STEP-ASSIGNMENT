/**
 * Week 7 - Problem 1: The Health Bar
 * Encapsulation — private health, final maxHealth, clamp at 0 and max
 */
class Character {
    private int health;
    private final int maxHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth; // start at full health
    }

    public void takeDamage(int amount) {
        int newHealth = health - amount;
        // Floor at 0
        health = Math.max(0, newHealth);
    }

    public void heal(int amount) {
        int newHealth = health + amount;
        // Cap at maxHealth
        health = Math.min(maxHealth, newHealth);
    }

    // Read-only access — no setter
    public int getHealth() {
        return health;
    }
}

public class P1_HealthBar {
    public static void main(String[] args) {
        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("After 30 damage: " + c.getHealth()); // 70

        c.heal(50);
        System.out.println("After heal 50: " + c.getHealth()); // 100 (capped)

        c.takeDamage(150);
        System.out.println("After 150 damage: " + c.getHealth()); // 0 (floored)
    }
}
