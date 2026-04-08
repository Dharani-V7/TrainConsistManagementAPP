import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Adding bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}