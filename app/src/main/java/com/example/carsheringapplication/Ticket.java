package com.example.carsheringapplication;
import org.threeten.bp.LocalTime;
import org.threeten.bp.LocalDate;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.FormatStyle;

public class Ticket {
    private String carName;
    private int imageResource;
    private int price;
    private LocalTime time;
    private String pickUpLocation;
    private LocalDate date;
    private String numberCar;
    private int pickUpTime;
    private boolean status = false;

    public Ticket(String carName, int price, String pickUpLocation, String numberCar, int imageResource,int pickUpTime) {
        this.carName = carName;
        this.price = price;
        this.time  = LocalTime.now();
        this.pickUpLocation = pickUpLocation;
        this.date = LocalDate.now();
        this.numberCar = numberCar;
        this.imageResource = imageResource;
        this.pickUpTime = pickUpTime;
    }
    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

    public String getTime() {
        return time.getHour() + ":" + time.getMinute();
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNumberCar() {
        return numberCar;
    }
    public int getImageResource() {
        return imageResource;
    }
    public void pay(){ status = true;}
    public int getPickUpTime() {
        return pickUpTime;
    }

    public boolean isStatus() {
        return status;
    }

}
