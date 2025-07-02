import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your numbers: ");
       int input = scanner.nextInt();

       Numbers.oddEvenChecker(input);
        Numbers.sum(input);

        int[] arr1 = {10, 5, 20, 15, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {7, 7, 3, 1, 9};
        int[] arr4 = {5, 5, 5, 5};
        int[] arr5 = {10, 30, 20, 30, 5};
        int[] arr6 = {42};
        int[] arr7 = {};

        Arrays.greaterNumber(arr1);
        Arrays.greaterNumber(arr2);
        Arrays.greaterNumber(arr3);
        Arrays.greaterNumber(arr4);
        Arrays.greaterNumber(arr5);
        Arrays.greaterNumber(arr6);
        Arrays.greaterNumber(arr7);
 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String input = scanner.next();

        Strings.reverseStrings(input);
    }
}