/*
* Name: Robert Phelps
* Date: 10/19
*
* Program: Java Collections grocery list program.
*
*/
package javacollections;

import java.util.Comparator;


// This class allows the objects of the type ITEM to be compared based on the name.
class ItemNameComp implements Comparator<Item> {

    @Override
    public int compare(Item i1, Item i2) {
        return i1.getName().compareTo(i2.getName());
    }
}
