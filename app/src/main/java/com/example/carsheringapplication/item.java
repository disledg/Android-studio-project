package com.example.carsheringapplication;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;

public class item {
    private int imageResource;
    private String itemName;
    private int itemPrice;
    private String itemLoc;
    private String numberCar;

    public item(int imageResource, String itemName, int itemPrice, String itemLoc, String numberCar) {
        this.imageResource = imageResource;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemLoc = itemLoc;
        this.numberCar = numberCar;
    }
    public int getImageResource() {
        return imageResource;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemLoc() {
        return itemLoc;
    }
    public String getNumberCar() {
        return numberCar;
    }
}
