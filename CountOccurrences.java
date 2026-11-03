public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20, 50, 20};
        int count = 0;
        int target = 20;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times");
    }
}
