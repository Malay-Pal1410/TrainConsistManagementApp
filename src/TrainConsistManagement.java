public class TrainConsistManagement {

    // CUSTOM EXCEPTION
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie model with validation
    static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("     UC14 - Handle Invalid Bogie Capacity        ");
        System.out.println("=================================================\n");

        try {
            // Attempt to create a valid bogie
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + validBogie.type + " -> " + validBogie.capacity);

            // Attempt to create an invalid bogie (this will throw an exception)
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + invalidBogie.type + " -> " + invalidBogie.capacity);

        } catch (InvalidCapacityException e) {
            // Handle the exception safely
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}