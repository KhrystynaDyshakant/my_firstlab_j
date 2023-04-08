package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class LuxuryHotel extends Hotel {
    private String name;
    private int numberOfSpaRooms;
    private int numberOfService;
    private int availableRoom;
    private int rating;
    private int totalRooms;

    public LuxuryHotel() {
    }


    public LuxuryHotel(String name, int numberOfSpaRooms, int numberOfService, int availableRoom, int rating,int totalRooms) {
        this.name = name;
        this.numberOfSpaRooms = numberOfSpaRooms;
        this.numberOfService = numberOfService;
        this.availableRoom = availableRoom;
        this.rating = rating;
        this.totalRooms=totalRooms;
    }

    public int getNumberOfSpaRooms() {
        this.numberOfSpaRooms = numberOfSpaRooms;
        return 0;
    }

    public int getAvailableRooms() {
        return availableRoom;
    }

    public int getRating() {
        return rating;
    }

    public int increaseNumberOfSpaRooms() {
        this.numberOfSpaRooms += 1;
        return 1;
    }

    public int addNumberOfService() {
        this.numberOfService++;
        return 0;
    }
    @Override
    public String toString() {
        return "LuxuryHotel {" +
                " name=" + name +
                " availableRoom="  + availableRoom +
                " rating=" +  rating  +
                " numberOfSpaRooms=" + numberOfSpaRooms +
                " numberOfService=" + numberOfService + '\'' +
                "} " ;
    }


    public String getLocation() {
        return null;
    }
}
