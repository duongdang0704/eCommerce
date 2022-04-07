package businessObjects;

import stepsDefinition.ShoppingCartSteps;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart(){
        itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }
    public void removeItem(Item item){
        itemList.remove(item);
    }

    public float getTotalAmount(){
        float total = 0;
        for (Item item:itemList
             ) {
            float subTotal = item.getPrice() * item.getQuantity();
            total += subTotal;
        }
        return total;
    }
}
