package models;

public class House extends Facility{
    private String standardRoom;
    private int floor;
     House() {

     }

    public House(String standardRoom, int floor) {
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public House(String nameService, Double areaUsable, int rentalCost, int maxPeople, String rentalType, String standardRoom, int floor) {
        super(nameService, areaUsable, rentalCost, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
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
        return  super.toString() +"House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", floor=" + floor +
                "} " ;
    }
}
