package models;

public class MovieShowing {
    private String movieShowingID;
    private String movieName;
    private String showingDay;
    private int ticketNumber;

    public MovieShowing(){}

    public MovieShowing(String movieShowingID, String movieName, String showingDay, int ticketNumber) {
        this.movieShowingID = movieShowingID;
        this.movieName = movieName;
        this.showingDay = showingDay;
        this.ticketNumber = ticketNumber;
    }

    public String getMovieShowingID() {
        return movieShowingID;
    }

    public void setMovieShowingID(String movieShowingID) {
        this.movieShowingID = movieShowingID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowingDay() {
        return showingDay;
    }

    public void setShowingDay(String showingDay) {
        this.showingDay = showingDay;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return movieShowingID+ ","+ movieName+"," +showingDay+","+ticketNumber;
    }

    public String showMovieShowing() {
        return "MovieShowing{" +
                "movieShowingID='" + movieShowingID + '\'' +
                ", movieName='" + movieName + '\'' +
                ", showingDay='" + showingDay + '\'' +
                ", ticketNumber=" + ticketNumber +
                '}';
    }
}
