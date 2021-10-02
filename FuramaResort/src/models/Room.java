package models;

public class Room extends Facility{
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String nameService, Double areaUsable, int rentalCost, int maxPeople, String rentalType, String serviceFree) {
        super(nameService, areaUsable, rentalCost, maxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return  super.getNameService()+"," +super.getAreaUsable()+","+super.getRentalCost()+","+super.getMaxPeople()+","+super.getRentalType()+","+serviceFree;
    }
    public String showRoom(){
      return    "Room{" +
              "nameService='" + super.getNameService() +
              ", areaUsable=" + super.getAreaUsable() +
              ", rentalCost=" + super.getRentalCost() +
              ", maxPeople=" + super.getMaxPeople() +
              ", rentalType='" + super.getRentalType() +
                ", serviceFree='" + serviceFree +
                "}" ;
    }
}
