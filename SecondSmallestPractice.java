public class SecondSmallestPractice {
    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 15, 2};

        int smallest = Integer.MAX_VALUE;
        Integer secondSmallest = null;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest &&
                       (secondSmallest == null || num < secondSmallest)) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        if (secondSmallest != null) {
            System.out.println("Second Smallest: " + secondSmallest);
        } else {
            System.out.println("Second smallest distinct element does not exist");
        }
    }
}
