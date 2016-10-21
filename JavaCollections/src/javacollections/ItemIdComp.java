/*
* Name: Robert Phelps
* Date: 10/19
*
* Program: Java Collections grocery list program.
*
*/
package javacollections;

import java.util.Comparator;


// This class allows the objects of the type ITEM to be compared based on the id.
class ItemIdComp implements Comparator<Item> {

    @Override
    public int compare(Item i1, Item i2) {
        if (i1.getId() > i2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
