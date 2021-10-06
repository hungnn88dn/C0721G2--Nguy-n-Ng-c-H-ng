package services;


import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import utils.Validate;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl  implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("src\\data\\facility.csv");
    boolean b = false;


    static LinkedHashMap<Facility, Integer> readFacility() {
        LinkedHashMap<Facility, Integer> facilityServiceList = new LinkedHashMap<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                if (lineSplit[0].contains("Room")) {
                    Facility facility = new Room(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2]),
                            Integer.parseInt(lineSplit[3]),
                            Integer.parseInt(lineSplit[4]), lineSplit[5], lineSplit[6]);
                    int value = Integer.parseInt(lineSplit[7]);
                    facilityServiceList.put(facility, value);
                } else if (lineSplit[0].contains("House")) {
                    Facility facility = new House(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2]),
                            Integer.parseInt(lineSplit[3]),
                            Integer.parseInt(lineSplit[4]), lineSplit[5], lineSplit[6], Integer.parseInt(lineSplit[7]));
                    int value = Integer.parseInt(lineSplit[8]);
                    facilityServiceList.put(facility, value);
                } else {
                    Facility facility = new Villa(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2]),
                            Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]), lineSplit[5],
                            lineSplit[6], Double.parseDouble(lineSplit[7]), Integer.parseInt(lineSplit[8]));
                    int value = Integer.parseInt(lineSplit[9]);
                    facilityServiceList.put(facility, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityServiceList;
    }

    static void writerFacility(LinkedHashMap<Facility, Integer> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Set<Facility> keySet = list.keySet();
            for (Facility key : keySet) {
                bufferedWriter.write(key + "," + list.get(key));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String validateInput(String str, String regex) {
        boolean b = true;
        do {
            b =Validate.validateInput(str,regex);
           if (b) {
               return str;
           }else {
               System.out.println("Wrong, please input again");
               str =scanner.nextLine();
           }
        } while (!b);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(FacilityServiceImpl.validateInput(scanner.nextLine(),Validate.NAME_SERVICE_VILLA));
    }

    @Override
    public void display() {
        LinkedHashMap<Facility, Integer> facilityServiceList = FacilityServiceImpl.readFacility();
        Set<Facility> keySet = facilityServiceList.keySet();
        for (Facility key : keySet) {
            if (key instanceof Room) {
                System.out.println(((Room) key).showRoom() + " : " + facilityServiceList.get(key));
            } else if (key instanceof House) {
                System.out.println(((House) key).showHouse() + " : " + facilityServiceList.get(key));
            } else {
                System.out.println(((Villa) key).showVilla() + " : " + facilityServiceList.get(key));
            }
        }
    }

    @Override
    public void add() {
        int choose;
        LinkedHashMap<Facility, Integer> list = FacilityServiceImpl.readFacility();
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("0. Back to Menu");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                System.out.println("input name service");
                String typeService = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input id service (SVVL-XXXX, X is number): ");
                String nameService = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.NAME_SERVICE_VILLA);
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA));
                System.out.println("input rental cost: ");
                int rentalCost = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR));
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.MAX_PEOPLE));
                System.out.println("input rental type: ");
                String rentalType = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input standar room: ");
                String standarRoom = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input pool area: ");
                double areaPool = Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA));
                System.out.println("input floor: ");
                int floor = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR));
                list.put(new Villa(typeService, nameService, usableArea, rentalCost, maxPeople, rentalType,
                        standarRoom, areaPool, floor), 0);
            }
            if (choose == 2) {
                System.out.println("input name service");
                String typeService = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input id service (SVVL-XXXX, X is number): ");
                String nameService = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.NAME_SERVICE_HOUSE);
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA));
                System.out.println("input rental cost: ");
                int rentalCost = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR));
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.MAX_PEOPLE));
                System.out.println("input rental type: ");
                String rentalType = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input standar room: ");
                String standarRoom = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input floor: ");
                int floor = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR));
                list.put(new House(typeService, nameService, usableArea, rentalCost, maxPeople,
                        rentalType, standarRoom, floor), 0);
            }
            if (choose == 3) {
                System.out.println("input name service");
                String typeService = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input id service (SVVL-XXXX, X is number): ");
                String nameService = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.NAME_SERVICE_HOUSE);
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA));
                System.out.println("input rental cost: ");
                int rentalCost = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR));
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.MAX_PEOPLE));
                System.out.println("input rental type: ");
                String rentalType = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                System.out.println("input free service: ");
                String serviceFree = FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE);
                list.put(new Room(typeService, nameService, usableArea, rentalCost, maxPeople, rentalType,
                        serviceFree), 0);
            }
            FacilityServiceImpl.writerFacility(list);
        } while (choose != 0);
    }

    @Override
    public void edit() {
        System.out.println("input name facility you need to edit: ");
        String name = scanner.nextLine();
        LinkedHashMap<Facility, Integer> list = FacilityServiceImpl.readFacility();
        Set<Facility> keySet = list.keySet();
        for (Facility key : keySet) {
            if (key.getServiceID().equals(name)) {
                if (key instanceof Villa) {
                    int chooseVilla;
                    do {
                        System.out.println(((Villa) key).showVilla());
                        System.out.println("1.Edit ServiceID: ");
                        System.out.println("2.Edit UsableArea: ");
                        System.out.println("3.Edit RentalCost: ");
                        System.out.println("4.Edit MaxPeople: ");
                        System.out.println("5.Edit RentalType: ");
                        System.out.println("6.Edit StandarRoom: ");
                        System.out.println("7.Edit AreaPool: ");
                        System.out.println("8.Edit Floor: ");
                        System.out.println("0.Exit ");
                        System.out.println("Your choose: ");
                        chooseVilla = Integer.parseInt(scanner.nextLine());
                        if (chooseVilla == 1) {
                            System.out.println("input service ID (SVVL-XXXX, X is number): ");
                            key.setServiceID(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.NAME_SERVICE_VILLA));
                        }
                        if (chooseVilla == 2) {
                            System.out.println("input usable area: ");
                            key.setAreaUsable(Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA)));
                        }
                        if (chooseVilla == 3) {
                            System.out.println("input rental cost: ");
                            key.setRentalCost(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR)));
                        }
                        if (chooseVilla == 4) {
                            System.out.println("input maximum number of people: ");
                            key.setMaxPeople(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.MAX_PEOPLE)));
                        }
                        if (chooseVilla == 5) {
                            System.out.println("input rental type: ");
                            key.setRentalType(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE));
                        }
                        if (chooseVilla == 6) {
                            System.out.println("input standar room: ");
                            ((Villa) key).setStandardRoom(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE));
                        }
                        if (chooseVilla == 7) {
                            System.out.println("input pool area: ");
                            ((Villa) key).setAreaPool(Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA)));
                        }
                        if (chooseVilla == 8) {
                            System.out.println("input floor: ");
                            ((Villa) key).setFloor(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR)));
                        }
                        FacilityServiceImpl.writerFacility(list);
                    } while (chooseVilla != 0);
                }
                if (key instanceof House) {
                    int chooseHouse;
                    do {
                        System.out.println(((House) key).showHouse());
                        System.out.println("1.Edit ServiceID: ");
                        System.out.println("2.Edit UsableArea: ");
                        System.out.println("3.Edit RentalCost: ");
                        System.out.println("4.Edit MaxPeople: ");
                        System.out.println("5.Edit RentalType: ");
                        System.out.println("6.Edit StandarRoom: ");
                        System.out.println("7.Edit Floor: ");
                        System.out.println("0.Exit ");
                        System.out.println("Your choose: ");
                        chooseHouse = Integer.parseInt(scanner.nextLine());
                        if (chooseHouse == 1) {
                            System.out.println("input name service (SVHO-XXXX, X is number): ");
                            key.setServiceID(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.NAME_SERVICE_HOUSE));
                        }
                        if (chooseHouse == 2) {
                            System.out.println("input usable area: ");
                            key.setAreaUsable(Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA)));
                        }
                        if (chooseHouse == 3) {
                            System.out.println("input rental cost: ");
                            key.setRentalCost(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR)));
                        }
                        if (chooseHouse == 4) {
                            System.out.println("input maximum number of people: ");
                            key.setMaxPeople(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.MAX_PEOPLE)));
                        }
                        if (chooseHouse == 5) {
                            System.out.println("input rental type: ");
                            key.setRentalType(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE));
                        }
                        if (chooseHouse == 6) {
                            System.out.println("input standar room: ");
                            ((Villa) key).setStandardRoom(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE));
                        }
                        if (chooseHouse == 7) {
                            System.out.println("input floor: ");
                            ((House) key).setFloor(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR)));
                        }
                        FacilityServiceImpl.writerFacility(list);
                    } while (chooseHouse != 0);
                }
                if (key instanceof Room) {

                    int chooseRoom;
                    do {
                        System.out.println(((Room) key).showRoom());
                        System.out.println("1.Edit ServiceID: ");
                        System.out.println("2.Edit UsableArea: ");
                        System.out.println("3.Edit RentalCost: ");
                        System.out.println("4.Edit MaxPeople: ");
                        System.out.println("5.Edit RentalType: ");
                        System.out.println("6.Edit StandarRoom: ");
                        System.out.println("7.Edit Free Service : ");
                        System.out.println("0.Exit ");
                        System.out.println("Your choose: ");
                        chooseRoom = Integer.parseInt(scanner.nextLine());
                        if (chooseRoom == 1) {
                            System.out.println("input name service (SVRO-XXXX, X is number): ");
                            key.setServiceID(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.NAME_SERVICE_ROOM));
                        }
                        if (chooseRoom == 2) {
                            System.out.println("input usable area: ");
                            key.setAreaUsable(Double.parseDouble(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.AREA)));
                        }
                        if (chooseRoom == 3) {
                            System.out.println("input rental cost: ");
                            key.setRentalCost(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.COST_FLOOR)));
                        }
                        if (chooseRoom == 4) {
                            System.out.println("input maximum number of people: ");
                            key.setMaxPeople(Integer.parseInt(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.MAX_PEOPLE)));
                        }
                        if (chooseRoom == 5) {
                            System.out.println("input rental type: ");
                            key.setRentalType(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE));
                        }
                        if (chooseRoom == 6) {
                            System.out.println("input free service: ");
                            ((Room) key).setServiceFree(FacilityServiceImpl.validateInput(scanner.nextLine(), Validate.SERVICE_TYPE));
                        }
                        System.out.println(((Room) key).showRoom());
                        FacilityServiceImpl.writerFacility(list);
                    } while (chooseRoom != 0);
                }
            }
        }

    }

    @Override
    public void search() {
//        update later
    }

    @Override
    public void delete() {
//         update later
    }
}
