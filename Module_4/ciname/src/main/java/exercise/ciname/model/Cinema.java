package exercise.ciname.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Pattern(regexp = "CI-\\d{4}",
            message = "Ma suat chieu phai dang CI-XXXX ")
    private String showCode;
    @ManyToOne(targetEntity = Film.class,fetch = FetchType.EAGER)
    private Film film;
    private String dayShow;
    @Min(1)
    private int ticketNumbers;

    public Cinema() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShowCode() {
        return showCode;
    }

    public void setShowCode(String showCode) {
        this.showCode = showCode;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getDayShow() {
        return dayShow;
    }

    public void setDayShow(String dayShow) {
        this.dayShow = dayShow;
    }

    public int getTicketNumbers() {
        return ticketNumbers;
    }

    public void setTicketNumbers(int ticketNumbers) {
        this.ticketNumbers = ticketNumbers;
    }
}
