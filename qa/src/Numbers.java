
public class Numbers {

    public static void oddEvenChecker(double number){
        if (number % 2 == 0){
            System.out.println("Your number is even");
        }
        else if (number % 2 != 0) {
            System.out.println("Your number is odd");
        }
        else
            System.out.println("Something is wrong");
    }
}
