package STEP_SEM3.Assignment_Problems;

public class Problem_3 {
  
    private final String password; // Immutable, set once in constructor[cite: 1]

    public Problem_3(String password) {
        this.password = password != null ? password : "";
    }

    // Evaluates strength internally without exposing the password string[cite: 1]
    public String getStrength() {
        int len = password.length();
        if (len < 6) {
            return "Weak";
        } else if (len <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
} 

