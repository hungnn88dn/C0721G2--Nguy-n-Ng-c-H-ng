package services;


import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService{
  static Scanner scanner= new Scanner(System.in);
    static LinkedHashMap<Facility, Integer> facilityServiceList= new LinkedHashMap<>();


    static {
        facilityServiceList.put(new Room("Room1",20.0,1000,2,"day","massage"),0);
        facilityServiceList.put(new Room("Room2",20.0,5000,2,"week","massage"),0);
        facilityServiceList.put(new House("House1",50.0,2000,4,"day","standard",3),0);
        facilityServiceList.put(new House("House2",40.0,6500,4,"week","VIP",2),0);
        facilityServiceList.put(new Villa("Villa1",70.0,1500,4,"day","VIP",20.0,2),0);
        facilityServiceList.put(new Villa("Villa1",70.0,8000,4,"week","VIP",20.0,2),0);
    }


    public static void displayFacility(LinkedHashMap<Facility, Integer> facilityServiceList) {
        Set<Facility> keySet= facilityServiceList.keySet();
        for (Facility key: keySet) {
            System.out.println(key + " : " + facilityServiceList.get(key));
        }
    }

    public static void main(String[] args) {
//        FacilityServiceImpl.displayFacility(facilityServiceList);
        facilityServiceList.keySet();
    }
    public static void addNewFacility(LinkedHashMap<Facility,Integer> list) {
        int choose;
        do{
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("0. Back to Menu");
            choose=scanner.nextInt();
            if (choose==1) {
                System.out.println("input name: ");
                String name= scanner.nextLine();
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.println("input rental cost: ");
                int rentalCost= Integer.parseInt(scanner.nextLine());
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("input rental type: ");
                String rentalType = scanner.nextLine();
                System.out.println("input standar room: ");
                String standarRoom= scanner.nextLine();
                System.out.println("input pool area: ");
                double areaPool= Double.parseDouble(scanner.nextLine());
                System.out.println("input floor: ");
                int floor= Integer.parseInt(scanner.nextLine());
                list.put(new Villa(name,usableArea,rentalCost,maxPeople,rentalType,standarRoom,areaPool,floor),0);
            }
            if (choose == 2) {
                System.out.println("input name: ");
                String name= scanner.nextLine();
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.println("input rental cost: ");
                int rentalCost= Integer.parseInt(scanner.nextLine());
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("input rental type: ");
                String rentalType = scanner.nextLine();
                System.out.println("input standar room: ");
                String standarRoom= scanner.nextLine();
                System.out.println("input floor: ");
                int floor= Integer.parseInt(scanner.nextLine());
                list.put(new House(name,usableArea,rentalCost,maxPeople,rentalType,standarRoom,floor),0);
            }
            if (choose == 3) {
                System.out.println("input name: ");
                String name= scanner.nextLine();
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.println("input rental cost: ");
                int rentalCost= Integer.parseInt(scanner.nextLine());
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("input rental type: ");
                String rentalType = scanner.nextLine();
                System.out.println("input free service: ");
                String serviceFree= scanner.nextLine();
                list.put(new Room(name,usableArea,rentalCost,maxPeople,rentalType,serviceFree),0);
            }
        }while(choose!=0);
    }

    public static void editFacility(LinkedHashMap<Facility,Integer> list) {
        System.out.println("input name facility you need to edit: ");
        String name = scanner.nextLine();
        Set<Facility> keySet = list.keySet();
        for (Facility key : keySet) {
            System.out.println(key + " : " + list.get(key));
             if (key.getNameService().equals(name)) {
                 System.out.println(key);
                 if (key instanceof Villa) {
                     int choose;
                     do {
                         System.out.println("1.Edit NameService: ");
                         System.out.println("2.Edit UsableArea: ");
                         System.out.println("3.Edit RentalCost: ");
                         System.out.println("4.Edit MaxPeople: ");
                         System.out.println("5.Edit RentalType: ");
                         System.out.println("6.Edit StandarRoom: ");
                         System.out.println("7.Edit AreaPool: ");
                         System.out.println("8.Edit Floor: ");
                         System.out.println("0.Exit ");


                         choose= Integer.parseInt(scanner.nextLine());
                     }while(choose != 0);
                 }

             }
        }
    }

}
