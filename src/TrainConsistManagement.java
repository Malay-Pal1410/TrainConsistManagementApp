import java.util.HashMap;
import java.util.Map;
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("  UC6 - Map Bogie to Capacity (HashMap)  ");
        System.out.println("=========================================\n");

        // HashMap stores data in key value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities
        // Note: The order printed may vary as HashMap does not guarantee insertion order
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");

        // Iterate through map entries using entrySet()
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}