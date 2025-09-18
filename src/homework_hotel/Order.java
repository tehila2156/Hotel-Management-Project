package homework_hotel;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guest_id")
    private Guest guest;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<Room> roomsList;

    private String date;

    public Order() {}

    public Order(int id, Guest guest, Set<Room> roomsList, String date) {
        this.id = id;
        this.guest = guest;
        this.roomsList = roomsList;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) { this.guest = guest; }

    public Set<Room> getRoomsList() { return roomsList; }
    public void setRoomsList(Set<Room> roomsList) { this.roomsList = roomsList; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
