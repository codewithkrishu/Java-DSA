public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 2, 15, 3};

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
