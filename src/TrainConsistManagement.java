import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS UseCase20TrainConsistMgmnt
 * ==========================================================
 *
 * Use Case 20: Prevent Search on Empty Train
 *
 * Description:
 * This class prevents search operations on an empty train
 * by throwing an IllegalStateException early.
 *
 * At this stage, the application:
 * - Checks whether the bogie collection is empty
 * - Throws IllegalStateException if no bogies exist
 * - Stops the operation immediately
 * - Displays a meaningful error message
 *
 * This maps defensive programming and fail-fast principles.
 *
 * @author Developer
 * @version 20.0
 */
public class TrainConsistManagement {

    // Search method demonstrating defensive programming
    public static void searchBogie(List<String> bogies, String searchId) {
        // State Validation: Check if collection is empty or null
        if (bogies == null || bogies.isEmpty()) {
            // Fail-Fast: Throw exception early with a meaningful message
            throw new IllegalStateException("Train consist is empty. Cannot perform search operation.");
        }

        // Search logic executes only if validation passes
        System.out.println("Searching for bogie: " + searchId + "...");
        boolean found = bogies.contains(searchId);

        if (found) {
            System.out.println("Result: Bogie " + searchId + " found in the consist.");
        } else {
            System.out.println("Result: Bogie " + searchId + " NOT found in the consist.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("     UC20 - Prevent Search on Empty Train        ");
        System.out.println("=================================================\n");

        // Scenario 1: Attempting to search an empty train
        System.out.println("--- Scenario 1: Empty Train Search ---");
        List<String> emptyTrain = new ArrayList<>();

        try {
            searchBogie(emptyTrain, "BG101");
        } catch (IllegalStateException e) {
            // Catching the runtime exception to display the error to the user
            System.out.println("Error Caught: " + e.getMessage());
        }

        System.out.println("\n--- Scenario 2: Populated Train Search ---");
        // Scenario 2: Searching a populated train
        List<String> populatedTrain = new ArrayList<>();
        populatedTrain.add("BG101");
        populatedTrain.add("BG205");

        try {
            searchBogie(populatedTrain, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error Caught: " + e.getMessage());
        }

        System.out.println("\nUC20 defensive programming completed...");
    }
}