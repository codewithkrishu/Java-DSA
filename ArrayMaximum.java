public class ArrayMaximum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 56};
        int maxElement = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        System.out.println("Maximum Element In Array -> " + maxElement);
    }
}
