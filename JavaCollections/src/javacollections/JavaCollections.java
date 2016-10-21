/*
* Name: Robert Phelps
* Date: 10/19
*
* Program: Java Collections grocery list program.
*
*/

package javacollections;

import java.util.Scanner;


public class JavaCollections {

    private static final String MENUITEMS = "Please select an example to run:\n"
            + "\t0. Exit Program\n"
            + "\t1. ArrayList\n"
            + "\t2. LinkedList\n"
            + "\t3. TreeSet\n"
            + "\t4. HashSet\n"
            + "\t5. TreeMap\n"
            + "\t6. HashMap\n";

    public static void main(String[] args) {
        displayJavaCollectionsMenu();
    }

    public static void displayJavaCollectionsMenu() {
        boolean valid = false;
        while (!valid) {
            System.out.println(MENUITEMS);
            Scanner scanner = new Scanner(System.in);
            int menuChoice = scanner.nextInt();
            valid = runExample(menuChoice);
        }
    }

    public static boolean runExample(int menuChoice) {
        CollectionExamples collectionExamples = new CollectionExamples();
        switch (menuChoice) {
            case 0:
                return true;
            case 1:
                collectionExamples.arrayList();
                break;
            case 2:
                collectionExamples.linkedList();
                break;
            case 3:
                collectionExamples.treeSet();
                break;
            case 4:
                collectionExamples.hashSet();
                break;
            case 5:
                collectionExamples.treeMap();
                break;
            case 6:
                collectionExamples.hashMap();
                break;
            default:
                System.out.println("Invalid input.");
        }
        return false;
    }
}
