
public class Numbers {

    public static void oddEvenChecker(int number){
        if (number % 2 == 0){
            System.out.println("Your number is even");
        }
        else
            System.out.println("Your number is odd");
    }

    public static void sum(int number){
        int sum = 0;
        for (int i = 1; i <= number; ++i){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
