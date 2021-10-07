package service;
import models.MovieShowing;
import utils.Validate;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieShowingServiceImpl implements MovieShowingService {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("src\\data\\movie_showing.csv");
    public static List<MovieShowing> readMovieShowing() {
        List<MovieShowing> list = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                list.add(new MovieShowing(lineSplit[0], lineSplit[1], lineSplit[2], Integer.parseInt(lineSplit[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writerMovieShowing(List<MovieShowing> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (MovieShowing movieShowing : list) {
                bufferedWriter.write(String.valueOf(movieShowing));
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
            b = Validate.validateInput(str, regex);
            if (b) {
                return str;
            } else {
                System.out.println("Wrong, please input again");
                str = scanner.nextLine();
            }
        } while (!b);
        return str;
    }

    @Override
    public void add() {
        System.out.println("Input movieShowing ID");
        String moveShowingID = MovieShowingServiceImpl.validateInput(scanner.nextLine(),Validate.MOVIE_SHOWING_ID);
        System.out.println("Input movie name");
        String movieName = MovieShowingServiceImpl.validateInput(scanner.nextLine(),Validate.NAME_MOVIE);
        System.out.println("Input movie showing day");
        String movieShowingday = Validate.valadateDay();
        System.out.println("Input ticked number");
        int ticketNumber =Integer.parseInt(MovieShowingServiceImpl.validateInput(scanner.nextLine(),Validate.TICKET_NUMBER)) ;
        List<MovieShowing> list = MovieShowingServiceImpl.readMovieShowing();
        list.add(new MovieShowing(moveShowingID,movieName,movieShowingday,ticketNumber));
        MovieShowingServiceImpl.writerMovieShowing(list);
    }

    @Override
    public void display() {
        List<MovieShowing> list = MovieShowingServiceImpl.readMovieShowing();
        for (MovieShowing movieShowing: list) {
            System.out.println(movieShowing.showMovieShowing());
        }
    }

    @Override
    public void delete() {
        List<MovieShowing> list = MovieShowingServiceImpl.readMovieShowing();
        System.out.println("Input movieShowingID you need to delete: ");
        String movieShowingID = scanner.nextLine();
        for (MovieShowing movieShowing: list) {
            if (movieShowing.getMovieShowingID().compareTo(movieShowingID) == 0) {
                int choose;
                do {
                    System.out.println("Do you want to delete" + movieShowing.getMovieName());
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    System.out.println("Your choose");
                    choose = Integer.parseInt(scanner.nextLine());
                    if(choose == 1) {
                        list.remove(movieShowing);
                        MovieShowingServiceImpl.writerMovieShowing(list);
                    }
                    if( choose == 2) {
                        System.out.println("Back to Menu");
                    }
                } while (choose !=2);
            }
        }
    }

    @Override
    public void edit() {
//        Update later
    }
}
