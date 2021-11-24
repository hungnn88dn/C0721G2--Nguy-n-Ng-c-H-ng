package exercise.demo.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 45)
    private String name;

    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 45)
    private String author;

    @Min(1)
    @Max(20)
    private int amount;

    @OneToMany(mappedBy = "book")
    List<Borrow> borrowList;


    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Borrow> getBorrowList() {
        return borrowList;
    }

    public void setBorrowList(List<Borrow> borrowList) {
        this.borrowList = borrowList;
    }
}
