package services;


import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("src\\data\\facility.csv");

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
                if (lineSplit.length == 7) {
                    Facility facility = new Room(lineSplit[0], Double.parseDouble(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), lineSplit[4], lineSplit[5]);
                    int value = Integer.parseInt(lineSplit[6]);
                    facilityServiceList.put(facility, value);
                } else if (lineSplit.length == 8) {
                    Facility facility = new House(lineSplit[0], Double.parseDouble(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), lineSplit[4], lineSplit[5], Integer.parseInt(lineSplit[6]));
                    int value = Integer.parseInt(lineSplit[7]);
                    facilityServiceList.put(facility, value);
                } else {
                    Facility facility = new Villa(lineSplit[0], Double.parseDouble(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), lineSplit[4], lineSplit[5], Double.parseDouble(lineSplit[6]), Integer.parseInt(lineSplit[7]));
                    int value = Integer.parseInt(lineSplit[8]);
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

    public static void displayFacility(LinkedHashMap<Facility, Integer> facilityServiceList) {
        facilityServiceList = FacilityServiceImpl.readFacility();
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

    public static void addNewFacility(LinkedHashMap<Facility, Integer> list) {
        int choose;
        list = FacilityServiceImpl.readFacility();
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("0. Back to Menu");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                System.out.println("input name: ");
                String name = scanner.nextLine();
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.println("input rental cost: ");
                int rentalCost = Integer.parseInt(scanner.nextLine());
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("input rental type: ");
                String rentalType = scanner.nextLine();
                System.out.println("input standar room: ");
                String standarRoom = scanner.nextLine();
                System.out.println("input pool area: ");
                double areaPool = Double.parseDouble(scanner.nextLine());
                System.out.println("input floor: ");
                int floor = Integer.parseInt(scanner.nextLine());
                list.put(new Villa(name, usableArea, rentalCost, maxPeople, rentalType, standarRoom, areaPool, floor), 0);
            }
            if (choose == 2) {
                System.out.println("input name: ");
                String name = scanner.nextLine();
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.println("input rental cost: ");
                int rentalCost = Integer.parseInt(scanner.nextLine());
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("input rental type: ");
                String rentalType = scanner.nextLine();
                System.out.println("input standar room: ");
                String standarRoom = scanner.nextLine();
                System.out.println("input floor: ");
                int floor = Integer.parseInt(scanner.nextLine());
                list.put(new House(name, usableArea, rentalCost, maxPeople, rentalType, standarRoom, floor), 0);
            }
            if (choose == 3) {
                System.out.println("input name: ");
                String name = scanner.nextLine();
                System.out.println("input usable area: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.println("input rental cost: ");
                int rentalCost = Integer.parseInt(scanner.nextLine());
                System.out.println("input maximum number of people: ");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("input rental type: ");
                String rentalType = scanner.nextLine();
                System.out.println("input free service: ");
                String serviceFree = scanner.nextLine();
                list.put(new Room(name, usableArea, rentalCost, maxPeople, rentalType, serviceFree), 0);
            }
            FacilityServiceImpl.writerFacility(list);
        } while (choose != 0);
    }

    public static void editFacility(LinkedHashMap<Facility, Integer> list) {
        System.out.println("input name facility you need to edit: ");
        String name = scanner.nextLine();
        list = FacilityServiceImpl.readFacility();
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
                            System.out.println("input Service Name: ");
                            key.setNameService(scanner.nextLine());
                        }
                        if (chooseVilla == 2) {
                            System.out.println("input Usable Area: ");
                            key.setAreaUsable(Double.parseDouble(scanner.nextLine()));
                        }
                        if (chooseVilla == 3) {
                            System.out.println("input Rental Cost: ");
                            key.setRentalCost(Integer.parseInt(scanner.nextLine()));
                        }
                        if (chooseVilla == 4) {
                            System.out.println("input maximum number of PeoPle: ");
                            key.setMaxPeople(Integer.parseInt(scanner.nextLine()));
                        }
                        if (chooseVilla == 5) {
                            System.out.println("input Rental Type: ");
                            key.setRentalType(scanner.nextLine());
                        }
                        if (chooseVilla == 6) {
                            System.out.println("input standar Room: ");
                            ((Villa) key).setStandardRoom(scanner.nextLine());
                        }
                        if (chooseVilla == 7) {
                            System.out.println("input Pool Area: ");
                            ((Villa) key).setAreaPool(Double.parseDouble(scanner.nextLine()));
                        }
                        if (chooseVilla == 8) {
                            System.out.println("input floor: ");
                            ((Villa) key).setFloor(Integer.parseInt(scanner.nextLine()));
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
                            System.out.println("input Service Name: ");
                            key.setNameService(scanner.nextLine());
                        }
                        if (chooseHouse == 2) {
                            System.out.println("input Usable Area: ");
                            key.setAreaUsable(Double.parseDouble(scanner.nextLine()));
                        }
                        if (chooseHouse == 3) {
                            System.out.println("input Rental Cost: ");
                            key.setRentalCost(Integer.parseInt(scanner.nextLine()));
                        }
                        if (chooseHouse == 4) {
                            System.out.println("input maximum number of PeoPle: ");
                            key.setMaxPeople(Integer.parseInt(scanner.nextLine()));
                        }
                        if (chooseHouse == 5) {
                            System.out.println("input Rental Type: ");
                            key.setRentalType(scanner.nextLine());
                        }
                        if (chooseHouse == 6) {
                            System.out.println("input standar Room: ");
                            ((House) key).setStandardRoom(scanner.nextLine());
                        }
                        if (chooseHouse == 7) {
                            System.out.println("input floor: ");
                            ((House) key).setFloor(Integer.parseInt(scanner.nextLine()));
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
                            System.out.println("input Service Name: ");
                            key.setNameService(scanner.nextLine());
                        }
                        if (chooseRoom == 2) {
                            System.out.println("input Usable Area: ");
                            key.setAreaUsable(Double.parseDouble(scanner.nextLine()));
                        }
                        if (chooseRoom == 3) {
                            System.out.println("input Rental Cost: ");
                            key.setRentalCost(Integer.parseInt(scanner.nextLine()));
                        }
                        if (chooseRoom == 4) {
                            System.out.println("input maximum number of PeoPle: ");
                            key.setMaxPeople(Integer.parseInt(scanner.nextLine()));
                        }
                        if (chooseRoom == 5) {
                            System.out.println("input Rental Type: ");
                            key.setRentalType(scanner.nextLine());
                        }
                        if (chooseRoom == 6) {
                            System.out.println("input free service: ");
                            ((Room) key).setServiceFree(scanner.nextLine());
                        }
                        System.out.println(((Room) key).showRoom());
                        FacilityServiceImpl.writerFacility(list);
                    } while (chooseRoom != 0);
                }
            }
        }
    }
}
