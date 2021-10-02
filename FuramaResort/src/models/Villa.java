package models;

public class Villa extends Facility {
    private String standardRoom;
    private double areaPool;
    private int floor;

    Villa() {

    }

    public Villa(String standardRoom, double areaPool, int floor) {
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String nameService, Double areaUsable, int rentalCost, int maxPeople, String rentalType, String standardRoom, double areaPool, int floor) {
        super(nameService, areaUsable, rentalCost, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.getNameService() + "," + super.getAreaUsable() + "," + super.getRentalCost() + "," + super.getMaxPeople() + "," + super.getRentalType() + "," + standardRoom + "," + areaPool + "," + floor;
    }

    public String showVilla() {
        return "Villa{" +
                "nameService='" + super.getNameService() +
                ", areaUsable=" + super.getAreaUsable() +
                ", rentalCost=" + super.getRentalCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", rentalType='" + super.getRentalType() +
                ", standardRoom='" + standardRoom +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                "} ";
    }
}
