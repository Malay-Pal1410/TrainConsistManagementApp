import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagement {

    public static void main(String[] args) {
        // Display welcome banner
        System.out.println("=== Train Consist Management App ===");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Corrected: Using '+' to concatenate the text and the list size
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Print the current state of the train
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("System ready for operations...");
    }
}
