
public class Arrays {
    public static void greaterNumber(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null. No numbers to check.");
            return;
        }

        if (arr.length == 1) {
            System.out.println("Array has only one element (" + arr[0] + "). This element has no 'other' numbers to compare against.");
            return;
        }

        boolean foundSuchNumber = false;

        for (int i = 0; i < arr.length; i++) {
            int candidate = arr[i];
            boolean isCandidateGreater = true;

            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (candidate <= arr[j]) {
                    isCandidateGreater = false;
                    break;
                }
            }

            if (isCandidateGreater) {
                System.out.println("Number " + candidate + " (at index " + i + ") IS strictly greater than all other numbers in the array.");
                foundSuchNumber = true;
            }
        }

        if (!foundSuchNumber) {
            System.out.println("No number in this array is strictly greater than all other numbers.");
        }
    }
}

