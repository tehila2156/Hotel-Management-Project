package homework_hotel;

import javax.persistence.*;

@Entity
public class Guest {

    @Id
    private int id;

    @Embedded
    private Person person;

    @OneToOne(mappedBy = "guest")
    private Order order;

    public Guest() {}

    public Guest(int id, Person person) {
        this.id = id;
        this.person = person;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}
