package kata;

public class NthSeries {
    public static String seriesSum(int n) {
        double result = 0.0;
        double denominator = 1;
        for (int i = 0; i < n; i++) {
            result += 1 / denominator;
            denominator += 3;
        }
        return String.format("%.2f", result);
    }
}
