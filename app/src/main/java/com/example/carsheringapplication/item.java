package com.example.carsheringapplication;

public class item {
    private int imageResource;
    private String itemName;
    private String itemPrice;
    private String itemLoc;

    public item(int imageResource, String itemName, String itemPrice, String itemLoc) {
        this.imageResource = imageResource;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemLoc = itemLoc;
    }
    public int getImageResource() {
        return imageResource;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemLoc() {
        return itemLoc;
    }
}
