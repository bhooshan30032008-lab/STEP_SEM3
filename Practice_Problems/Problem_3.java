package STEP_SEM3.Practice_Problems;

public final class Problem_3 {
    

    private final String firstName;
    private final char lastNameInitial;

    public Problem_3(String fullName) {
        String[] parts = fullName.trim().split(" ");
        this.firstName = parts[0];
        this.lastNameInitial = parts[1].charAt(0);
    }

    public String getNickname() {
        return this.firstName + " " + this.lastNameInitial + ".";
    }

    public static void main(String[] args) {
        Problem_3 tag = new Problem_3("Maria Gomez");
        System.out.println("tag.getNickname() -> " + tag.getNickname());
    }
}


