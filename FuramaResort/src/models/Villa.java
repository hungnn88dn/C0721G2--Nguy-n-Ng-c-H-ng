package models;

public class Villa {
    private int standardRoom;
    private double areaPool;
    private int floor;
    Villa() {

    }

    public Villa(int standardRoom, double areaPool, int floor) {
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public int getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(int standardRoom) {
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
        return "Villa{" +
                "standardRoom=" + standardRoom +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }
}
