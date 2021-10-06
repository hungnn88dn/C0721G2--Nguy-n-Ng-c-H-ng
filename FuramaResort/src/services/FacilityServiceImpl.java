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

public class FacilityServiceImpl implements FacilityService {
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
                String typeService;
                do {
                    System.out.println("input type service");
                    typeService = scanner.nextLine();
                    b = Validate.validateAllName(typeService);
                } while (!b);
                String nameService;
                do {
                    System.out.println("input name service (SVVL-XXXX, X is number): ");
                    nameService = scanner.nextLine();
                    b = Validate.validateServiceName(nameService);
                } while (!b);
                double usableArea;
                do {
                    System.out.println("input usable area: ");
                    usableArea = Double.parseDouble(scanner.nextLine());
                    b = Validate.validateArea(String.valueOf(usableArea));
                } while (!b);
                int rentalCost;
                do {
                    System.out.println("input rental cost: ");
                    rentalCost = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateCostAndFloor(String.valueOf(rentalCost));
                } while (!b);
                int maxPeople;
                do {
                    System.out.println("input maximum number of people: ");
                    maxPeople = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateMaxPeople(String.valueOf(maxPeople));
                } while (!b);
                String rentalType;
                do {
                    System.out.println("input rental type: ");
                    rentalType = scanner.nextLine();
                    b = Validate.validateAllName(rentalType);
                } while (!b);
                String standarRoom;
                do {
                    System.out.println("input standar room: ");
                    standarRoom = scanner.nextLine();
                    b = Validate.validateAllName(standarRoom);
                } while (!b);
                double areaPool;
                do {
                    System.out.println("input pool area: ");
                    areaPool = Double.parseDouble(scanner.nextLine());
                    b = Validate.validateArea(String.valueOf(areaPool));
                } while (!b);
                int floor;
                do {
                    System.out.println("input floor: ");
                    floor = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateCostAndFloor(String.valueOf(floor));
                } while (!b);
                list.put(new Villa(typeService, nameService, usableArea, rentalCost, maxPeople, rentalType,
                        standarRoom, areaPool, floor), 0);
            }
            if (choose == 2) {
                String typeService;
                do {
                    System.out.println("input type service");
                    typeService = scanner.nextLine();
                    b = Validate.validateAllName(typeService);
                } while (!b);
                String nameService;
                do {
                    System.out.println("input name service (SVHO-XXXX, X is number): ");
                    nameService = scanner.nextLine();
                    b = Validate.validateServiceName(nameService);
                } while (!b);
                double usableArea;
                do {
                    System.out.println("input usable area: ");
                    usableArea = Double.parseDouble(scanner.nextLine());
                    b = Validate.validateArea(String.valueOf(usableArea));
                } while (!b);
                int rentalCost;
                do {
                    System.out.println("input rental cost: ");
                    rentalCost = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateCostAndFloor(String.valueOf(rentalCost));
                } while (!b);
                int maxPeople;
                do {
                    System.out.println("input maximum number of people: ");
                    maxPeople = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateMaxPeople(String.valueOf(maxPeople));
                } while (!b);
                String rentalType;
                do {
                    System.out.println("input rental type: ");
                    rentalType = scanner.nextLine();
                    b = Validate.validateAllName(rentalType);
                } while (!b);
                String standarRoom;
                do {
                    System.out.println("input standar room: ");
                     standarRoom = scanner.nextLine();
                    b = Validate.validateAllName(standarRoom);
                } while (!b);
                int floor;
                do {
                    System.out.println("input floor: ");
                    floor = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateCostAndFloor(String.valueOf(floor));
                } while (!b);
                list.put(new House(typeService, nameService, usableArea, rentalCost, maxPeople,
                        rentalType, standarRoom, floor), 0);
            }
            if (choose == 3) {
                String typeService;
                do {
                    System.out.println("input type service");
                    typeService = scanner.nextLine();
                    b = Validate.validateAllName(typeService);
                } while (!b);
                String nameService;
                do {
                    System.out.println("input name service (SVHO-XXXX, X is number): ");
                    nameService = scanner.nextLine();
                    b = Validate.validateServiceName(nameService);
                } while (!b);
                double usableArea;
                do {
                    System.out.println("input usable area: ");
                    usableArea = Double.parseDouble(scanner.nextLine());
                    b = Validate.validateArea(String.valueOf(usableArea));
                } while (!b);
                int rentalCost;
                do {
                    System.out.println("input rental cost: ");
                    rentalCost = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateCostAndFloor(String.valueOf(rentalCost));
                } while (!b);
                int maxPeople;
                do {
                    System.out.println("input maximum number of people: ");
                    maxPeople = Integer.parseInt(scanner.nextLine());
                    b = Validate.validateMaxPeople(String.valueOf(maxPeople));
                } while (!b);
                String rentalType;
                do {
                    System.out.println("input rental type: ");
                    rentalType = scanner.nextLine();
                    b = Validate.validateAllName(rentalType);
                } while (!b);
                System.out.println("input free service: ");
                String serviceFree = scanner.nextLine();
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
            if (key.getNameService().equals(name)) {
                if (key instanceof Villa) {
                    int chooseVilla;
                    do {
                        System.out.println(((Villa) key).showVilla());
                        System.out.println("1.Edit NameService: ");
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
                            String nameService;
                            do {
                                System.out.println("input name service (SVVL-XXXX, X is number): ");
                                nameService = scanner.nextLine();
                                b = Validate.validateServiceName(nameService);
                            } while (!b);
                            key.setNameService(nameService);
                        }
                        if (chooseVilla == 2) {
                            double usableArea;
                            do {
                                System.out.println("input usable area: ");
                                usableArea = Double.parseDouble(scanner.nextLine());
                                b = Validate.validateArea(String.valueOf(usableArea));
                            } while (!b);
                            key.setAreaUsable(usableArea);
                        }
                        if (chooseVilla == 3) {
                            int rentalCost;
                            do {
                                System.out.println("input rental cost: ");
                                rentalCost = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateCostAndFloor(String.valueOf(rentalCost));
                            } while (!b);
                            key.setRentalCost(rentalCost);
                        }
                        if (chooseVilla == 4) {
                            int maxPeople;
                            do {
                                System.out.println("input maximum number of people: ");
                                maxPeople = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateMaxPeople(String.valueOf(maxPeople));
                            } while (!b);
                            key.setMaxPeople(maxPeople);
                        }
                        if (chooseVilla == 5) {
                            String rentalType;
                            do {
                                System.out.println("input rental type: ");
                                rentalType = scanner.nextLine();
                                b = Validate.validateAllName(rentalType);
                            } while (!b);
                            key.setRentalType(rentalType);
                        }
                        if (chooseVilla == 6) {
                            String standarRoom;
                            do {
                                System.out.println("input standar room: ");
                                standarRoom = scanner.nextLine();
                                b = Validate.validateAllName(standarRoom);
                            } while (!b);
                            ((Villa) key).setStandardRoom(standarRoom);
                        }
                        if (chooseVilla == 7) {
                            double areaPool;
                            do {
                                System.out.println("input pool area: ");
                                areaPool = Double.parseDouble(scanner.nextLine());
                                b = Validate.validateArea(String.valueOf(areaPool));
                            } while (!b);
                            ((Villa) key).setAreaPool(areaPool);
                        }
                        if (chooseVilla == 8) {
                            int floor;
                            do {
                                System.out.println("input floor: ");
                                floor = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateCostAndFloor(String.valueOf(floor));
                            } while (!b);
                            ((Villa) key).setFloor(floor);
                        }
                        FacilityServiceImpl.writerFacility(list);
                    } while (chooseVilla != 0);
                }
                if (key instanceof House) {
                    int chooseHouse;
                    do {
                        System.out.println(((House) key).showHouse());
                        System.out.println("1.Edit NameService: ");
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
                            String nameService;
                            do {
                                System.out.println("input name service (SVVL-XXXX, X is number): ");
                                nameService = scanner.nextLine();
                                b = Validate.validateServiceName(nameService);
                            } while (!b);
                            key.setNameService(nameService);
                        }
                        if (chooseHouse == 2) {
                            double usableArea;
                            do {
                                System.out.println("input usable area: ");
                                usableArea = Double.parseDouble(scanner.nextLine());
                                b = Validate.validateArea(String.valueOf(usableArea));
                            } while (!b);
                            key.setAreaUsable(usableArea);
                        }
                        if (chooseHouse == 3) {
                            int rentalCost;
                            do {
                                System.out.println("input rental cost: ");
                                rentalCost = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateCostAndFloor(String.valueOf(rentalCost));
                            } while (!b);
                            key.setRentalCost(rentalCost);
                        }
                        if (chooseHouse == 4) {
                            int maxPeople;
                            do {
                                System.out.println("input maximum number of people: ");
                                maxPeople = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateMaxPeople(String.valueOf(maxPeople));
                            } while (!b);
                            key.setMaxPeople(maxPeople);
                        }
                        if (chooseHouse == 5) {
                            String rentalType;
                            do {
                                System.out.println("input rental type: ");
                                rentalType = scanner.nextLine();
                                b = Validate.validateAllName(rentalType);
                            } while (!b);
                            key.setRentalType(rentalType);
                        }
                        if (chooseHouse == 6) {
                            String standarRoom;
                            do {
                                System.out.println("input standar room: ");
                                standarRoom = scanner.nextLine();
                                b = Validate.validateAllName(standarRoom);
                            } while (!b);
                            ((Villa) key).setStandardRoom(standarRoom);
                        }
                        if (chooseHouse == 7) {
                            int floor;
                            do {
                                System.out.println("input floor: ");
                                floor = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateCostAndFloor(String.valueOf(floor));
                            } while (!b);
                            ((Villa) key).setFloor(floor);
                        }
                        System.out.println(((House) key).showHouse());
                        FacilityServiceImpl.writerFacility(list);
                    } while (chooseHouse != 0);
                }
                if (key instanceof Room) {

                    int chooseRoom;
                    do {
                        System.out.println(((Room) key).showRoom());
                        System.out.println("1.Edit NameService: ");
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
                            String nameService;
                            do {
                                System.out.println("input name service (SVVL-XXXX, X is number): ");
                                nameService = scanner.nextLine();
                                b = Validate.validateServiceName(nameService);
                            } while (!b);
                            key.setNameService(nameService);
                        }
                        if (chooseRoom == 2) {
                            double usableArea;
                            do {
                                System.out.println("input usable area: ");
                                usableArea = Double.parseDouble(scanner.nextLine());
                                b = Validate.validateArea(String.valueOf(usableArea));
                            } while (!b);
                            key.setAreaUsable(usableArea);
                        }
                        if (chooseRoom == 3) {
                            int rentalCost;
                            do {
                                System.out.println("input rental cost: ");
                                rentalCost = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateCostAndFloor(String.valueOf(rentalCost));
                            } while (!b);
                            key.setRentalCost(rentalCost);
                        }
                        if (chooseRoom == 4) {
                            int maxPeople;
                            do {
                                System.out.println("input maximum number of people: ");
                                maxPeople = Integer.parseInt(scanner.nextLine());
                                b = Validate.validateMaxPeople(String.valueOf(maxPeople));
                            } while (!b);
                            key.setMaxPeople(maxPeople);
                        }
                        if (chooseRoom == 5) {
                            String rentalType;
                            do {
                                System.out.println("input rental type: ");
                                rentalType = scanner.nextLine();
                                b = Validate.validateAllName(rentalType);
                            } while (!b);
                            key.setRentalType(rentalType);
                        }
                        if (chooseRoom == 6) {
                            String serviceFree;
                            do {
                                System.out.println("input free service: ");
                                serviceFree = scanner.nextLine();
                                b = Validate.validateAllName(serviceFree);
                            } while (!b);
                            ((Room) key).setServiceFree(serviceFree);
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
