//package bankSystemUnitTests;
//import Creatures.Player;
//import Areas.Spaceship;
//import Items.Item;
//import Items.Shield;
//import static org.junit.Assert.*;
//import org.junit.Test;
//
//public class PlayerTest {
//
//
//    /**
//     * Tests Player Getters
//     */
//    @Test
//    public void testGetters() {
//        Player p = new Player("P");
//        assertFalse(p.getSpacesuit());
//        assertFalse(p.getShield());
//        assertNull(p.getWin());
//        assertFalse(p.getKey());
//    }
//
//    /**
//     * Tests Player Setters
//     */
//    @Test
//    public void testSetters() {
//        Player p = new Player("P");
//        p.setSpacesuit(true);
//        p.setShield(true);
//        p.setWin(true);
//        p.setKey(true);
//        assertTrue(p.getSpacesuit());
//        assertTrue(p.getShield());
//        assertTrue(p.getWin());
//        assertTrue(p.getKey());
//    }
//
//    /**
//     * Tests pickupItem when successful
//     */
//    @Test
//    public void pickupItemSuccess() {
//        Player p = new Player("P");
//        Spaceship a = new Spaceship();
//        Shield i = new Shield();
//        a.addItem(i);
//        p.setLocation(a);
//        p.pickupItem(i);
//        assertEquals(p.getInventory().get(0), i);
//    }
//
//    /**
//     * Tests pickupItem when unsuccessful due to not being in the area
//     */
//    @Test
//    public void pickupItemNotInArea() {
//        Player p = new Player("P");
//        Spaceship a = new Spaceship();
//        Shield i = new Shield();
//        p.setLocation(a);
//        p.pickupItem(i);
//        assertEquals(p.getInventory().size(), 0);
//    }
//
//    /**
//     * Tests pickupItem when unsuccessful due to not being in the area
//     */
//    @Test
//    public void pickupItemInventoryLimit() {
//        Player p = new Player("P");
//        Spaceship a = new Spaceship();
//        Shield i = new Shield();
//        a.addItem(i);
//        p.setLocation(a);
//        p.setInventoryLimit(0);
//        p.pickupItem(i);
//        assertEquals(p.getInventory().size(), 0);
//    }
//
//    /**
//     * Tests pickupAllItems when successful
//     */
//    @Test
//    public void pickupAllItemsSuccess() {
//        Player p = new Player("P");
//        Spaceship a = new Spaceship();
//        Shield s = new Shield();
//        Item i = new Item();
//        a.addItem(i);
//        a.addItem(s);
//        p.setLocation(a);
//        p.pickupAllItems();
//        assertEquals(p.getInventory().size(), 2);
//    }
//
//    /**
//     * Tests pickupAllItems when unsuccessful due to inventory being full
//     */
//    @Test
//    public void pickupAllItemsFail() {
//        Player p = new Player("P");
//        Spaceship a = new Spaceship();
//        Shield s = new Shield();
//        Item i = new Item();
//        a.addItem(i);
//        a.addItem(s);
//        p.setLocation(a);
//        p.setInventoryLimit(1);
//        p.pickupAllItems();
//        assertEquals(p.getInventory().size(), 0);
//    }
//
//
//
//
//}