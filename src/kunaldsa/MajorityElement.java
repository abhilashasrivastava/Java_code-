package kunaldsa;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int n = arr.length;
        int majorityElement = findMajorityElement(arr, n);
        System.out.println("The majority element is: " + majorityElement);
    }

    public static int findMajorityElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        // The problem statement assumes that a majority element always exists,
        // so this line will never be reached. But for the sake of completeness:
        return -1;
    }
}
