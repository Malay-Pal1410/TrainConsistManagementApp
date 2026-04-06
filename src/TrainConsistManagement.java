import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class TrainConsistManagement {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   UC7 - Sort Bogies by Capacity (Comparator)    ");
        System.out.println("=================================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display unsorted data
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();

        // Sort using Comparator logic based on capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted result
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();

        System.out.println("UC7 sorting completed...");
    }
}