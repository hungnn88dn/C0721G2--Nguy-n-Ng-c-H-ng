package models;

public class House {
    private int standardRoom;
    private int floor;
     House() {

     }

    public House(int standardRoom, int floor) {
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public int getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(int standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom=" + standardRoom +
                ", floor=" + floor +
                '}';
    }
}
