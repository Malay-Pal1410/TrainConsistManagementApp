import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class TrainConsistManagement {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("=================================================\n");

        // Create large test dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            // Alternate capacities to simulate realistic data
            int capacity = (i % 2 == 0) ? 72 : 56;
            bogies.add(new Bogie("Passenger", capacity));
        }

        // --- MEASURE LOOP-BASED FILTERING ---
        long loopStartTime = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long loopEndTime = System.nanoTime();
        long loopDuration = loopEndTime - loopStartTime;

        // --- MEASURE STREAM-BASED FILTERING ---
        long streamStartTime = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEndTime = System.nanoTime();
        long streamDuration = streamEndTime - streamStartTime;

        // --- DISPLAY RESULTS ---
        System.out.println("Loop Execution Time (ns): " + loopDuration);
        System.out.println("Stream Execution Time (ns): " + streamDuration);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}