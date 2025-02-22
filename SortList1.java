import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/* Command prompts to run this program in Terminal.
// cd /Users/ikeiloegbu/Documents/SCHOOL/CSC6301/PROJECT4/PROJECT4.1
// javac SortList1.java
 javac SortList1 */

/*
 * To intiate the javadoc. Go to the directory where your program lives and enter the following. 
 * javadoc SortList1.java
 * This will create HTML file with instructions to this program.
 */

/*
 * In this code, I reused functionality that exists in Java Development Kit.
 * I made use of the LinkedList functionality and Collections.sort method. 
 */

/**
 * The {@code SortList1} class provides functionality to store a collection
 * of integers in a linked list structure, sort the list, and display the elements.
 *
 * <p>This class makes use of the {@link java.util.LinkedList} from the Java
 * Collections Framework to manage the list of integers. It provides methods to:
 * <ul>
 *     <li>Add elements to the list</li>
 *     <li>Sort the list in ascending order</li>
 *     <li>Display elements of the list</li>
 * </ul>
 *
 * <p>The {@code main()} method demonstrates a simple use case where integers are input
 * from the user, added to the list, sorted, and then displayed.</p>
 *
 * <p>This class is primarily designed for educational purposes to demonstrate
 * basic list operations using Java Collections.</p>
 *
 * @author User
 * @version 1.0
 * @since 2023
 */

public class SortList1 {

    /**
     * A linked list to store integer values.
     * @param accepts a single integer to a node generating a linked list.
     * 
     */

    // This code creates an instance of LinkedList<Integer> to store integers. 
    // This is an expample of reusing existing functionality from Java Std library.
    private LinkedList<Integer> list;

    /**
     * Constructs an empty {@code SortList1} instance.
     * Initializes the internal linked list.
     */

    public SortList1() {
        list = new LinkedList<>();
    }

    /**
     * Adds a new integer to the end of the list.
     *
     * @param data the integer to be added to the list
     */

    public void addNode(int data) {
        list.add(data);
    }

    /**
     * Sorts the elements of the list in ascending order.
     *
     * <p>This method utilizes the {@link java.util.Collections#sort} method
     * which provides efficient sorting of the list elements.</p>
     */

    public void sortList() {
    // Here is another example of reusing existing code from Java Development Kit called Collections.sort.
        Collections.sort(list);
    }

    /**
     * Displays the elements of the list to the standard output.
     *
     * <p>Each element in the list is printed on the same line followed by a space.</p>
     */

    public void displayList() {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * The main method serves as an entry point for the program.
     *
     * <p>It prompts the user to enter integers until a non-integer input is provided.
     * The entered integers are added to an instance of {@code SortList1}, sorted, and displayed
     * before and after sorting. It also measures the time taken for the operations.</p>
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args) {

        // New instance of SortList1 being used as 'sl'
        SortList1 sl = new SortList1();
        Scanner sc = new Scanner(System.in);
        // Prompt for user to enter numbers to add to list until a non integer has been added.
        System.out.println("Enter numbers to add to the list (or type 'done' to finish): ");
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            sl.addNode(number);

        }
        sc.close();
        // Prints list before sorting
        System.out.println("List before sorting: ");
        sl.displayList();
        // Function call to sort list
        sl.sortList();
        // Prints list after sorting
        System.out.println("List after sorting: ");
        sl.displayList();
        // End of tracking time for program to run
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        // Prints out the time it took for the program to run.
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
