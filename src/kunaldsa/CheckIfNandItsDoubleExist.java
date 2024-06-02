package kunaldsa;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    System.out.println("True");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("false");
        }
    }
}
