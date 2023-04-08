package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class EcoHotel extends Hotel {
    private String name;
    private int gym;
    private boolean garden;
    private int availableRooms;
    private int rating;
    private int totalRooms;

    public EcoHotel() {
        super();

    }



    public EcoHotel(String name, int gym, boolean garden,int availableRooms, int rating,int totalRooms) {
        super();
        this.name = name;
        this.gym = gym;
        this.garden = garden;
        this.availableRooms=availableRooms;
        this.rating=rating;
        this.totalRooms=totalRooms;


    }
    public int getAvailableRooms(){
        return availableRooms;
    }
    public int getRating() {
        return rating;
    }

        public boolean hasGarden() {
        return true;
    }

    public int numberOfCountGyms() {

        int gymCount = 0;

        return 1;
    }

    @Override
    public String toString() {
        return "EcoHotel {" +
                " name=" + name +
                " gym=" + gym +
                " garden=" + garden + '\'' +
                "} " ;
    }


    public String getLocation() {
        return null;
    }

    public boolean getGarden() {
        return false;
    }

    public int getGymCount() {
        return 0;
    }
}
