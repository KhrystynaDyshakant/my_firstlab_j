package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelManagerTest {
    private HotelManager hotelManager;

    @BeforeEach
    public void setUp() {
        hotelManager = new HotelManager();
        hotelManager.addHotel(new ResortHotel("Grand", 4, 2, 3));
        hotelManager.addHotel(new Motel(17, 90, "Lviv", "Sokal", "Lviv-Sokal"));
        hotelManager.addHotel(new LuxuryHotel("Lion", 5, 14, 0, 4, 1));
        hotelManager.addHotel(new EcoHotel("Flower", 2, true, 0, 1, 1));
        hotelManager.addHotel(new ResortHotel("Zirka", 4, 5, 4));
        hotelManager.addHotel(new Motel(4, 12, "Sokal", "Chervonograd", "Sokal-Chervonograd"));
        hotelManager.addHotel(new LuxuryHotel("Astra", 4, 11, 0, 2, 1));
        hotelManager.addHotel(new EcoHotel("Tree", 5, false, 0, 5, 1));
    }


    @Test
    void testFindHotelWithAvailableRoomsNotFound() {
        List<Hotel> hotelsWithAvailableRooms = hotelManager.findHotelWithAvailableRooms(10);
        assertEquals(0, hotelsWithAvailableRooms.size());
    }

    @Test
    void testFindHotelWithInvalidAvailableRooms() {
        List<Hotel> hotelsWithAvailableRooms = hotelManager.findHotelWithAvailableRooms(-1);
        assertEquals(0, hotelsWithAvailableRooms.size());
    }

    @Test
    void testFindHotelWithRatingMoreThanNotFound() {
        List<Hotel> hotelsWithRating = hotelManager.findHotelWithRatingMoreThan(5);
        assertEquals(0, hotelsWithRating.size());
    }

    @Test
    void testFindHotelWithInvalidRating() {
        List<Hotel> hotelsWithRating = hotelManager.findHotelWithRatingMoreThan(4);
        assertEquals(0, hotelsWithRating.size());
    }

    @Test
    void testFindHotelWithRating() {
        List<Hotel> hotelsWithRating = hotelManager.findHotelWithRatingMoreThan(2);
        assertEquals(0, hotelsWithRating.size());
    }
}

