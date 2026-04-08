import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}