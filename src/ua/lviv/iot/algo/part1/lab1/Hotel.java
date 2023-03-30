package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public abstract class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;
    private static Hotel defaultHotel;

    public static Hotel getInstance() {
        return defaultHotel;
    }

    /* public Hotel(String name, int totalRooms, int availableRooms, int rating) {
         this.name = name;
         this.totalRooms = totalRooms;
         this.availableRooms = availableRooms;
         this.rating = rating;
     }*/
    public void bookRoom() {
        if (availableRooms > 0) {
            availableRooms--;
        } else {
            System.out.println("Зменшує кількість вільних кімнат на 1");
        }
    }

    public void releaseRoom() {
        availableRooms++;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public int getBookedRoomsCount() {
        return totalRooms - availableRooms;
    }

    @Override
    public String toString() {
        return "Hotel " + "name='" + name + '\'' + ", totalRooms=" + totalRooms + ", availableRooms=" + availableRooms +
                ", rating=" + rating;
    }

    public abstract String getLocation();

    public int getRating() {
        return rating;
    }
}

