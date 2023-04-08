package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    private Hotel hotel;

    @BeforeEach
    public void setUp() {
        hotel = new EcoHotel("Flower", 2, true, 0, 1, 2);
    }

    @Test
    void testGetRating() {
        int expected = 1;
        int actual = hotel.getRating();
        assertEquals(expected, actual);
    }
    @Test
    void testGetName(){
        hotel.getName();
        assertEquals("Flower", hotel.getName());

    }
    @Test
     void getInstance() {
        Hotel expected = hotel.getInstance();
        assertNull(expected);
    }
    @Test
     void bookRoom() {
        hotel.bookRoom();
        assertEquals(0, hotel.getAvailableRooms());
    }
    @Test
     void testGetTotalRooms() {
        assertEquals(2, hotel.getTotalRooms());
    }
    @Test
     void getBookedRoomsCount() {
        assertEquals(0, hotel.getBookedRoomsCount());
    }

    @Test
     void testBookRoom() {
        int initialAvailableRooms = hotel.getAvailableRooms();
        hotel.bookRoom();
        assertEquals(0, hotel.getAvailableRooms());
    }
    @Test
     void testReleaseRoom() {
        int initialAvailableRooms = hotel.getAvailableRooms();
        hotel.releaseRoom();
        assertEquals(initialAvailableRooms + 0, hotel.getAvailableRooms());
    }
    @Test
    void testGetAvailableRooms() {
        int expected = 0;
        int actual = hotel.getAvailableRooms();
        assertEquals(expected, actual);
    }
    @Test
     void testGetLocation() {
        assertNull(hotel.getLocation());
    }
    @Test
     void testGetInstance() {
        Hotel defaultHotel = Hotel.getInstance();
        assertNull(defaultHotel);
    }
    @Test
     void testGetBookedRoomsCount() {
        assertEquals(0, hotel.getBookedRoomsCount());
    }

    @Test
    void testToString() {
        String expected = "EcoHotel {" +
                " name=Flower" +
                " gym=2" +
                " garden=true'" +
                "} ";

        String actual = hotel.toString();

        assertEquals(expected, actual);
    }

    @Test
     void getName() {
        String name = hotel.getName();
        assertEquals("Flower", name);
    }
}

