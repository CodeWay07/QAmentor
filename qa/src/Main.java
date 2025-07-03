import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String input = scanner.next();

        Strings.reverseStrings(input);

        Animals.makeSound();
        Dog.makeSound();
        Cat.makeSound();
        Racoon.makeSound();
*/

        List<Book> libraryBooks = new ArrayList<>();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10);
        Book book2 = new Book("Moby Dick", "Herman Melville", 14);
        Book book3 = new Book("To the Lighthouse", "Virginia Woolf", 12);
        Book book4 = new Book("1984", "George Orwell", 9);
        Book book5 = new Book("the Green Mile", "Stephen King", 11);
        Book book6 = new Book("Martin Eden", "Jack London", 13);
        Book book7 = new Book("Bad Blood", "John Carreyrou", 8);
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);
        libraryBooks.add(book4);
        libraryBooks.add(book5);
        libraryBooks.add(book6);
        libraryBooks.add(book7);


//        System.out.println("\n--- Current Library Catalog ---");
//        for (Book book : libraryBooks) {
//            System.out.println(book);
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Search book by ID: ");
        int searchId = scanner.nextInt();

        for (Book book : libraryBooks) {
            if (book.getId() == searchId) {
                book.printDetails();
                break;
            }
        }
    }
}