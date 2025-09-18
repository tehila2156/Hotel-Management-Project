/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework_hotel;
import java.util.HashSet;
import java.util.Set;
 import javax.persistence.*;
/**
 *
 * @author User
 */
public class Homework_hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("homework_hotelPU");
        EntityManager em= emf.createEntityManager();         
                
            // יצירת אובייקטים
        Person person = new Person("שרה", "כהן");
Guest guest = new Guest(1, person);

Set<Room> rooms = new HashSet<>();
Order order = new Order(1, guest, rooms, "2025-06-24");

Room room1 = new Room(101, "יחיד");
room1.setOrder(order);
Room room2 = new Room(102, "זוגי");
room2.setOrder(order);

rooms.add(room1);
rooms.add(room2);

guest.setOrder(order); // קשר הפוך

em.getTransaction().begin();
em.persist(order); // Cascade שומר את כולם
em.getTransaction().commit();


        System.out.println("אורח נשמר בהצלחה!");

        em.close();
        emf.close();
                
    }
    
}
