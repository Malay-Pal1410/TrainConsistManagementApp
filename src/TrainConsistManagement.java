/**
 * ==========================================================
 * MAIN CLASS UseCase19TrainConsistMgmnt
 * ==========================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using an optimized Binary Search algorithm.
 *
 * At this stage, the application:
 * - Ensures data is sorted
 * - Initializes low and high indexes
 * - Finds the middle index
 * - Uses compareTo() for string comparison
 * - Halves the search range until found or exhausted
 * - Displays search result
 *
 * This maps optimized searching using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("     UC19 - Binary Search for Bogie ID           ");
        System.out.println("=================================================\n");

        // Precondition: Binary search requires sorted data
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchKey = "BG412";

        System.out.println("Available Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println("\nSearching for: " + searchKey + "...\n");

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            // Find the middle index (avoids integer overflow)
            int mid = low + (high - low) / 2;

            // Use compareTo for lexicographic string comparison
            int comparisonResult = searchKey.compareTo(bogieIds[mid]);

            if (comparisonResult == 0) {
                // Key matches mid element
                found = true;
                break;
            } else if (comparisonResult < 0) {
                // Key is smaller, search the left half
                high = mid - 1;
            } else {
                // Key is larger, search the right half
                low = mid + 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("Result: Bogie '" + searchKey + "' found in train consist.");
        } else {
            System.out.println("Result: Bogie '" + searchKey + "' NOT found in train consist.");
        }

        System.out.println("\nUC19 binary search completed...");
    }
}