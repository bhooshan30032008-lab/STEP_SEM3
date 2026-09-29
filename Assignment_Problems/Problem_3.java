package STEP_SEM3.Assignment_Problems;
  import java.time.LocalDate;
import java.util.*;

public class Problem_3 {
    


static abstract class Subscription {
    protected String name;
    protected LocalDate startDate;

    public Subscription(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public abstract LocalDate getRenewalDate();
}

static class BasicSubscription extends Subscription {
    public BasicSubscription(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    public LocalDate getRenewalDate() {
        return startDate.plusDays(30); 
    }
}

static class StandardSubscription extends Subscription {
    public StandardSubscription(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    public LocalDate getRenewalDate() {
        return startDate.plusDays(90); 
    }
}

static class PremiumSubscription extends Subscription {
    public PremiumSubscription(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    public LocalDate getRenewalDate() {
        return startDate.plusDays(365); 
    }
}

public static class StreamingPlanReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        List<Subscription> subscribers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String planType = sc.next();
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate startDate = LocalDate.parse(dateStr);

            switch (planType) {
                case "BASIC":
                    subscribers.add(new BasicSubscription(name, startDate));
                    break;
                case "STANDARD":
                    subscribers.add(new StandardSubscription(name, startDate));
                    break;
                case "PREMIUM":
                    subscribers.add(new PremiumSubscription(name, startDate));
                    break;
            }
        }

      
        for (Subscription sub : subscribers) {
            System.out.println(sub.getName() + ": " + sub.getRenewalDate());
        }

        sc.close();
    }
}
    }


