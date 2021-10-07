package controller;

import service.MovieShowingServiceImpl;

import java.util.Scanner;

public class CinameController {
 static Scanner scanner= new Scanner(System.in);
 MovieShowingServiceImpl movieShowingService = new MovieShowingServiceImpl();
 CinameController cinameController = new CinameController();

    public void displayMenu() {
        int choose;
        do {
            System.out.println("1.Show All Movie Showwing");
            System.out.println("2.Adđ Movie Showwing");
            System.out.println("3.Delete Movie Showing");
            System.out.println("0.Exit");
            choose= Integer.parseInt(scanner.nextLine());
            if (choose ==1) {
                movieShowingService.display();
            }
            if (choose ==2) {
                movieShowingService.add();
            }
            if (choose ==2) {
                movieShowingService.delete();
            }
        } while(choose != 0);
    }
}
