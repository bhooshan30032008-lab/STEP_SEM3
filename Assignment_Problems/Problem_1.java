package STEP_SEM3.Assignment_Problems;

public class Problem_1 {
    
    private final int maxHealth; 
    private int health;          

    public Problem_1(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth; // starts at full health[cite: 1]
    }

    public void takeDamage(int amount) {
        if (amount <= 0) return;
        health -= amount;
        if (health < 0) {
            health = 0; // clamp at 0[cite: 1]
        }
    }

    public void heal(int amount) {
        if (amount <= 0) return;
        health += amount;
        if (health > maxHealth) {
            health = maxHealth; 
        }
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
}
