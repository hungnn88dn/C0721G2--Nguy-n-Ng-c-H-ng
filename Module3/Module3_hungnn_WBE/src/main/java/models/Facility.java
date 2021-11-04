package models;

public  class Facility {
    private int serviceID;
    private String serviceName;
     private int areaUsable;
    private int maxPeople;
    private int rentalCost;
     private String standardRoom;
     private String description;
     private double poolArea;
     private int floor;
     private String typeRental;
     private String typeService;

    public Facility(int serviceID, String serviceName, int areaUsable, int maxPeople, int rentalCost, String
            standardRoom, String description, double poolArea, int floor, String typeRental, String typeService) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.areaUsable = areaUsable;
        this.maxPeople = maxPeople;
        this.rentalCost = rentalCost;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.floor = floor;
        this.typeRental = typeRental;
        this.typeService = typeService;
    }

    public Facility(String serviceName, int areaUsable, int maxPeople, int rentalCost, String standardRoom, String description, double poolArea, int floor, String typeRental, String typeService) {
        this.serviceName = serviceName;
        this.areaUsable = areaUsable;
        this.maxPeople = maxPeople;
        this.rentalCost = rentalCost;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.floor = floor;
        this.typeRental = typeRental;
        this.typeService = typeService;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(int areaUsable) {
        this.areaUsable = areaUsable;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
}
