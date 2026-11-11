import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithEqual0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 0};

        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int value : arr) {
            // Convert 0 to -1 and keep 1 as +1.
            if (value == 0) {
                prefixSum -= 1;
            } else {
                prefixSum += 1;
            }

            // Equal numbers of 0s and 1s make the transformed sum zero.
            count += frequency.getOrDefault(prefixSum, 0);

            frequency.put(
                prefixSum,
                frequency.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println("Subarrays with equal 0s and 1s = " + count);
    }
}
