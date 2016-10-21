/*
* Name: Robert Phelps
* Date: 10/19
*
* Program: Java Collections grocery list program.
*
*/
package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import static javacollections.GroceryCategory.DAIRY;
import static javacollections.GroceryCategory.GENERAL;
import static javacollections.GroceryCategory.MEAT;


public class CollectionExamples {
    ItemCollection itemCollection = new ItemCollection();

    //Four items created for use in these collection examples
    //Item(int id, String itemName, String notes, double price, double quantity, GroceryCategory groceryCategory, int recipeKey)
    Item Soda = new Item(0, "Soda", "", 5.00, 1, GENERAL, 1);
    Item eggs = new Item(1, "Eggs", "", 4.20, 6, DAIRY, 1);
    Item milk = new Item(2, "Milk", "Buy at Walmart", 3.00, 1, DAIRY, 1);
    Item Steak = new Item(3, "Steak", "", 20.00, 2, MEAT, 1);

    
    public void arrayList() {
        ArrayList<Item> itemArrayList = new ArrayList<>();

        itemArrayList.add(Soda);           //Index 0
        itemArrayList.add(eggs);            //Index 1
        itemArrayList.add(milk);            //Index 2
        itemArrayList.add(Steak);  //Index 3

        //Example of sorting---------------------------------------------------------------------------
        System.out.println("ArrayList contents before sort by item name:"
                + itemCollection.ToString(itemArrayList));

        System.out.println("Sorting ArrayList by item name.");
        itemArrayList.sort(new ItemNameComp());

        System.out.println("ArrayList contents after sort by item name:"
                + itemCollection.ToString(itemArrayList));

        System.out.println("Sorting ArrayList by grocery category.");
        itemArrayList.sort(new ItemGroceryCategoryComp());

        System.out.println("ArrayList contents after sort by grocery category:"
                + itemCollection.ToString(itemArrayList));

        System.out.println();
    }

   
    public void linkedList() {
        LinkedList<Item> linkedList = new LinkedList<>();

        System.out.println("Items inserted into LinkedList: Soda, eggs, milk, Steak");

        linkedList.add(Soda);
        linkedList.add(eggs);
        linkedList.add(milk);
        linkedList.add(Steak);

        System.out.println("LinkedList Contents:"
                + itemCollection.ToString(linkedList));

        System.out.println("Remove Milk from list");
        linkedList.remove(milk);

        System.out.println("LinkedList Contents:"
                + itemCollection.ToString(linkedList));

        System.out.println();
    }

    
    public void treeSet() {
        //TreeSet that is automatically ordered by item name.
        TreeSet<Item> treeSetName = new TreeSet<>(new ItemNameComp());

        System.out.println("Example of treeSet that is ordered on the item name");
        System.out.println("Items inserted into TreeSetName: Soda, eggs, milk, Steak");

        treeSetName.add(Soda);
        treeSetName.add(eggs);
        treeSetName.add(milk);
        treeSetName.add(Steak);

        System.out.println("TreeSetName Contents:"
                + itemCollection.ToString(treeSetName));
        System.out.println(((TreeSet) treeSetName).comparator());

        //TreeSet that is automatically ordered by item name.
        TreeSet<Item> treeSetId = new TreeSet<>(new ItemIdComp());

        System.out.println();

        System.out.println("Example of treeSet that is ordered on the item ID");
        System.out.println("Items inserted into TreeSetId: Soda:0, milk:2, eggs:1, Steak:3");

        treeSetId.add(Soda);
        treeSetId.add(milk);
        treeSetId.add(eggs);
        treeSetId.add(Steak);

        System.out.println("TreeSetId Contents:"
                + itemCollection.ToString(treeSetId));
        System.out.println(((TreeSet) treeSetId).comparator());

        System.out.println();
    }

   
    public void hashSet() {
        HashSet<Item> hashSet = new HashSet<>();

        hashSet.add(Soda);
        hashSet.add(eggs);
        hashSet.add(milk);
        hashSet.add(Steak);

        System.out.println("Items inserted into HashSet: Soda, eggs, milk, Steak");

        System.out.println("HashSet Contents:"
                + itemCollection.ToString(hashSet));

        System.out.println("Attempting to add Soda to list again.");

        if (hashSet.add(Soda)) { //If add returns true.
            System.out.println("Soda added");
        }
        else { //If add returns false.
            System.out.println("Soda not added. Duplicate item.");
        }

        System.out.println("HashSet Contents:"
                + itemCollection.ToString(hashSet));

        System.out.println();
    }

    // Map: Sorted tree of values. Sorted by map ordering keys,
    // not values. put and get.
    // Methods to get keys in order:
    // firstKey, higherKey, lastKey, lowerKey
    public void treeMap() {
        TreeMap<String, Item> treeMap = new TreeMap<>();

        treeMap.put("Soda", Soda);
        treeMap.put("eggs", eggs);
        treeMap.put("milk", milk);
        treeMap.put("Steak", Steak);

        System.out.println("TreeMap Contents:"
                + itemCollection.ToString(treeMap));

        System.out.println();
    }

    // Map: Unsorted key/value pairs. Key used to get value.
    // put and get. List of all values, not in order.
    public void hashMap() {
        HashMap<String, Item> hashMap = new HashMap<>();

        hashMap.put("Soda", Soda);
        hashMap.put("eggs", eggs);
        hashMap.put("milk", milk);
        hashMap.put("Steak", Steak);

        System.out.println("HashMap Contents:"
                + itemCollection.ToString(hashMap));

        System.out.println();
    }
}
