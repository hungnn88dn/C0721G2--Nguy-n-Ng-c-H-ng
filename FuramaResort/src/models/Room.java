package models;

public class Room extends Facility{

    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceType, String nameService, Double areaUsable, int rentalCost, int maxPeople, String rentalType, String serviceFree) {
        super(serviceType, nameService, areaUsable, rentalCost, maxPeople, rentalType);
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
        return  super.getServiceType()+","+super.getNameService()+"," +super.getAreaUsable()+","+super.getRentalCost()+","+super.getMaxPeople()+","+super.getRentalType()+","+serviceFree;
    }
    public String showRoom(){
      return    "Room{" + "serviceType= " + super.getServiceType() +
              ", nameService='" + super.getNameService() +
              ", areaUsable=" + super.getAreaUsable() +
              ", rentalCost=" + super.getRentalCost() +
              ", maxPeople=" + super.getMaxPeople() +
              ", rentalType='" + super.getRentalType() +
                ", serviceFree='" + serviceFree +
                "}" ;
    }
}
