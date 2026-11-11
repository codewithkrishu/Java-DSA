import java.util.HashMap;
import java.util.Map;

public class CountSubarraysSumDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;

        if (k == 0) {
            System.out.println("K must not be 0.");
            return;
        }

        Map<Integer, Integer> remainderFrequency = new HashMap<>();
        remainderFrequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int value : arr) {
            prefixSum += value;

            // Normalize remainder so it is non-negative, even for negative sums.
            int remainder = ((prefixSum % k) + Math.abs(k)) % Math.abs(k);

            count += remainderFrequency.getOrDefault(remainder, 0);

            remainderFrequency.put(
                remainder,
                remainderFrequency.getOrDefault(remainder, 0) + 1
            );
        }

        System.out.println("Subarrays with sum divisible by " + k + " = " + count);
    }
}
