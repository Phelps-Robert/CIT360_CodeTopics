/*
* Name: Robert Phelps
* Date: 10/19
*
* Program: Java Collections grocery  program.
*
*/
package javacollections;

import java.util.ArrayList;
import java.util.Objects;

public class Item {

    private int id;
    private String name;
    private String notes;
    private double price;
    private double quantity;
    private GroceryCategory groceryCategory;
    private int recipeKey;

    public Item() {
    }

    // Constructor for creating item with no recipe foreign key.
    public Item(int id, String itemName, String notes, double price, double quantity, GroceryCategory groceryCategory) {
        this.id = id;
        this.name = itemName;
        this.notes = notes;
        this.price = price;
        this.quantity = quantity;
        this.groceryCategory = groceryCategory;
        this.recipeKey = 0;
    }

    // Constructor for creating item with recipe foreign key
    public Item(int id, String itemName, String notes, double price, double quantity, GroceryCategory groceryCategory, int recipeKey) {
        this.id = id;
        this.name = itemName;
        this.notes = notes;
        this.price = price;
        this.quantity = quantity;
        this.groceryCategory = groceryCategory;
        this.recipeKey = recipeKey;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public int getRecipeKey() {
        return recipeKey;
    }

    public GroceryCategory getGroceryCategory() {
        return groceryCategory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setGroceryCategory(GroceryCategory groceryCategory) {
        this.groceryCategory = groceryCategory;
    }

    public void setRecipeKey(int recipeKey) {
        this.recipeKey = recipeKey;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.notes);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.groceryCategory);
        hash = 37 * hash + this.recipeKey;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (this.groceryCategory != other.groceryCategory) {
            return false;
        }
        if (this.recipeKey != other.recipeKey) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "id= " + id + ", itemName= " + name + ", notes= " + notes + ", price= " + price + ", quantity= " + quantity + ", groceryCategory= " + groceryCategory + ", recipeKey= " + recipeKey + '}';
    }
}
