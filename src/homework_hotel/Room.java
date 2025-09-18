package homework_hotel;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    private int roomNumber;

    private String type;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Room() {}

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}
