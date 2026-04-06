import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class TrainConsistManagement {

    // Reusing Bogie model from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   UC8 - Filter Passenger Bogies Using Streams   ");
        System.out.println("=================================================\n");

        // Create list of passenger bogies (same style as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();

        // Convert list to stream, apply filter, and collect results
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        // Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println("\nUC8 filtering completed...");
    }
}