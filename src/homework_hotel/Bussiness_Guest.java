/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_hotel;

import javax.persistence.Entity;

/**
 *
 * @author User
 */
@Entity
public class Bussiness_Guest extends Guest{
    
    
    private int discount;

    public Bussiness_Guest() {}

    public Bussiness_Guest(int id, Person person, int discount) {
        super(id, person);
        this.discount = discount;
    }

    public int getDiscount() { return discount; }
    public void setDiscount(int d) { this.discount = d; }
    
    
}
