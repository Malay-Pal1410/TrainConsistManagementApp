import java.util.Arrays;
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  UC17 - Sort Bogie Names Using Arrays.sort()    ");
        System.out.println("=================================================\n");

        // Create an array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original order
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames) + "\n");

        // Use Arrays.sort() to sort the array alphabetically
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames) + "\n");

        System.out.println("UC17 sorting completed...");
    }
}