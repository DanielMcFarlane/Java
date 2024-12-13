public class Hotel
{
    private Room[] rooms;

    public Hotel()
    {
        rooms = new Room[10];
    }


    public void addRooms(){
            rooms[0] = new Room(103, "Single", 1, 100.00);
            rooms[1] = new Room(212, "Single", 1, 120.00);
            rooms[2] = new Room(307, "Single", 1, 130.00);
            rooms[3] = new Room(414, "Double", 2, 200.00);
            rooms[4] = new Room(528, "Double", 2, 220.00);
            rooms[5] = new Room(611, "Double", 2, 220.00);
            rooms[6] = new Room(702, "Double", 2, 250.00);
            rooms[7] = new Room(804, "Double", 2, 300.00);
            rooms[8] = new Room(901, "Suite", 4, 1000.00);
            rooms[9] = new Room(904, "Suite", 4, 1000.00);
    }
    
    
    
    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
    
    
    
    public Room getCheapestRoom(){
        Room cheapestRoom = rooms[0];
        
        for (Room room : rooms){
            if (room.getPrice() < cheapestRoom.getPrice()){
                cheapestRoom = room;
            }
        }
        return cheapestRoom;
    }
}
