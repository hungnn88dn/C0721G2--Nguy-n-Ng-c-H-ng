package models;

public abstract class Facility {
    private String serviceType;
    private String nameService;
     private Double areaUsable;
     private int rentalCost;
     private int maxPeople;
     private String rentalType;
     Facility() {

     }

    public Facility(String serviceType, String nameService, Double areaUsable, int rentalCost, int maxPeople, String rentalType) {
        this.serviceType = serviceType;
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(Double areaUsable) {
        this.areaUsable = areaUsable;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceType='" + serviceType + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUsable=" + areaUsable +
                ", rentalCost=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

}
