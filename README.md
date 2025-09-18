# 🏨 Hotel Management – Java Project (JPA)

**Summary Project**  

A project designed to manage hotel operations, including rooms, guests, and orders.  
The system implements CRUD operations and advanced data retrieval using JPQL and NamedQuery.

---

## ✨ **Features**
### **RoomController**
- `getRoomsOfLevel` – return all rooms of a specific level.  
- `getRoomsOfFloor` – return all rooms on a specific floor.  
- `getAvailableRooms` – return all available rooms.  
- `setStatusRoom` – update the status of a room by its number.  

### **GuestController**
- `getGuestById` – find a guest by ID.  
- `getGuestByName` – find a guest by name.  
- `setNumVisit` – increment the visit count of a guest and update the database.  

### **OrderController**
- `getOrderOfGuest` – retrieve orders for a specific guest.  
- `getOrdersOfRoom` – find all orders related to a specific room.  
- `getRoomsOfOrder` – retrieve all rooms of a specific order.  
- `getOrdersOfNumDays` – find orders with a specific number of days.  

---

## 🖥️ **System Architecture**
- **Backend**: Java, JPA (Hibernate)  
- **Database**: SQL-based relational database  
- **Architecture**: N-Tier, separation of concerns between controllers and entities  

---

## 🚀 **Getting Started**
1. Populate the database with relevant room, guest, and order data.  
2. Run the project and execute the main function to test controllers and queries.  
3. Use the provided functions to manage rooms, guests, and orders.  

---

## 📚 **Project Goals**
- Implement full CRUD operations for hotel management.  
- Practice JPQL queries and NamedQuery for advanced data retrieval.  
- Apply N-Tier architecture and separation of concerns.  
- Test and validate data updates and retrieval functions efficiently.
