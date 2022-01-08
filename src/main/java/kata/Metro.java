package kata;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.parallelStream()
                .mapToInt(stop -> stop[0] - stop[1])
                .sum();
    }
}
