import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   UC11 - Validate Train ID and Cargo Code       ");
        System.out.println("=================================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        System.out.println("\nValidation Results:");

        // ---- DEFINE REGEX RULES ----

        // Define regex pattern for Train ID (TRN- followed by exactly 4 digits)
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);

        // Define regex pattern for Cargo Code (PET- followed by exactly 2 uppercase letters)
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);

        // Display whether the input is valid or invalid using matches()
        System.out.println("Train ID Valid: " + trainIdMatcher.matches());
        System.out.println("Cargo Code Valid: " + cargoCodeMatcher.matches());

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}